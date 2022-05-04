package de.wolff.rwtonspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


// Simple Spring MVC controller that redirects to the desired RWT entrypoint. Not necessarily needed, but
// demonstrates how to easily redirect the root URL of your app to an RWT entrypoint.
@Controller
public class HelloRwtOnSpringBootController {

    @GetMapping("/")
    public String index() {
        return "redirect:/hello";
    }
}
