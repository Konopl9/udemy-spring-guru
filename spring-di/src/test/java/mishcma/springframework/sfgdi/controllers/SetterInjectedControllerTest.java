package mishcma.springframework.sfgdi.controllers;


import mishcma.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}