package guru.springframework.springdidemo.controllers;

import guru.springframework.springdidemo.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
