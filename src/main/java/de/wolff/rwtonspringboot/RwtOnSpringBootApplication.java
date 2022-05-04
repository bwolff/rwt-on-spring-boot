package de.wolff.rwtonspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class RwtOnSpringBootApplication extends SpringBootServletInitializer {

    // Used with "bootRun"
    public static void main(String[] args) {
        SpringApplication.run(RwtOnSpringBootApplication.class, args);
    }

    // Used when deployed as WAR
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RwtOnSpringBootApplication.class);
    }
}
