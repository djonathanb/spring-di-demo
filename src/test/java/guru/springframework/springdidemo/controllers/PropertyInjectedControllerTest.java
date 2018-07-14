package guru.springframework.springdidemo.controllers;

import guru.springframework.springdidemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController controller;

    @Before
    public void setUp() {
        this.controller = new PropertyInjectedController();
        this.controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, controller.sayHello());
    }
}