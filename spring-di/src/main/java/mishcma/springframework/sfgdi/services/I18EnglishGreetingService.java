package mishcma.springframework.sfgdi.services;


import mishcma.springframework.sfgdi.repositories.EnglishGreetingRepository;

public class I18EnglishGreetingService implements GreetingService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18EnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.greeting();
    }
}
