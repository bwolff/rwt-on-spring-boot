package de.wolff.rwtonspringboot.config;

import org.eclipse.rap.rwt.engine.RWTServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RwtServletConfiguration {

    // Registers the RWTServlet to the URLs of the entrypoints. Multiple URL mappings for multiple entrypoints
    // can be added. Eliminates the need for a web.xml, together with the RwtContextInitializer component.
    @Bean
    public ServletRegistrationBean<RWTServlet> rwtServlet() {
        var bean = new ServletRegistrationBean<>(new RWTServlet());
        bean.addUrlMappings("/hello");
        return bean;
    }
}
