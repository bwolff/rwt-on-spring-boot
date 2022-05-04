package de.wolff.rwtonspringboot.config;

import org.eclipse.rap.rwt.application.ApplicationConfiguration;
import org.eclipse.rap.rwt.application.ApplicationRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import javax.servlet.ServletContext;


// Initializer bean that starts the RWT application when the servlet context initializes. Using this component
// eliminates the need to register the default org.eclipse.rap.rwt.engine.RWTServletContextListener in a web.xml
// and allows to benefit from having the ApplicationConfiguration injected as a Spring bean.
//
// This component is the second piece next to the RwtServletConfiguration to remove the need for a web.xml file.
@Component
public class RwtContextInitializer implements ServletContextInitializer {

    private final ApplicationConfiguration applicationConfiguration;
    private ApplicationRunner applicationRunner;

    @Autowired
    public RwtContextInitializer(ApplicationConfiguration applicationConfiguration) {
        this.applicationConfiguration = applicationConfiguration;
    }

    @Override
    public void onStartup(ServletContext servletContext) {
        applicationRunner = new ApplicationRunner(applicationConfiguration, servletContext);
        applicationRunner.start();
    }

    @PreDestroy
    public void destroy() {
        if (applicationRunner != null) {
            try {
                applicationRunner.stop();
            } finally {
                applicationRunner = null;
            }
        }
    }
}
