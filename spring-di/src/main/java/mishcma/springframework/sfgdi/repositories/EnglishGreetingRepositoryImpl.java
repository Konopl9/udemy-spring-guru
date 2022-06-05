package mishcma.springframework.sfgdi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String greeting() {
        return "Hello World - EN";
    }
}
