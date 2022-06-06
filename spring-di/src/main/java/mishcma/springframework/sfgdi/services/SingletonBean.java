package mishcma.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("I am creating a singleton bean");
    }

    public String getMyScope() {
        return "I'm a Singleton";
    }
}
