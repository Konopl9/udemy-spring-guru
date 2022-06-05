package mishcma.springframework.sfgdi.config;

import mishcma.springframework.sfgdi.repositories.EnglishGreetingRepository;
import mishcma.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import mishcma.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18SpanishGreetingService I18SpanishGreetingService() {
        return new I18SpanishGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18EnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18EnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedService setterInjectedService() {
        return new SetterInjectedService();
    }

}
