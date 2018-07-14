package guru.springframework.springdidemo.controllers;

import guru.springframework.springdidemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @Before
    public void setUp() {
        this.controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, controller.sayHello());
    }
}