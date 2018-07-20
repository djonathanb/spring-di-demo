package guru.springframework.springdidemo.controllers;

import guru.springframework.springdidemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Autowired
    private GreetingService greetingService;

    public String hello() {
        return greetingService.sayGreeting();
    }

}
