package de.wolff.rwtonspringboot.config;

import de.wolff.rwtonspringboot.HelloRwtOnSpringBootEntryPoint;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;
import org.eclipse.rap.rwt.client.WebClient;
import org.springframework.stereotype.Component;

import java.util.HashMap;


// The RWT ApplicationConfiguration is created as a managed Spring bean (component) to be able to benefit
// from DI and to be injected into other initializer beans (see RwtContextInitializer).
@Component
public class RwtApplicationConfiguration implements ApplicationConfiguration {

    @Override
    public void configure(Application application) {
        // SWT_COMPATIBILITY mode is required for using blocking Dialog API. Required when using JFace.
        application.setOperationMode(Application.OperationMode.SWT_COMPATIBILITY);

        // Register entrypoints, resources, themes, service handlers etc....
        var properties = new HashMap<String, String>();
        properties.put(WebClient.PAGE_TITLE, "RWT on Spring Boot");

        // RWT themes can be used as well.
        application.addStyleSheet(RWT.DEFAULT_THEME_ID, "themes/customRwtTheme.css");

        // Using a static reference to the EntryPoint class here. Could also be an EntryPointFactory that works
        // with injected EntryPoint components at application startup.
        application.addEntryPoint("/hello", HelloRwtOnSpringBootEntryPoint.class, properties);
    }
}
