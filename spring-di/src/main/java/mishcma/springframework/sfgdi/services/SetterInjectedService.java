package mishcma.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

public class SetterInjectedService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
