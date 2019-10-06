package pl.sdacademy.service;

import pl.sdacademy.repository.GreetingRepository;
import pl.sdacademy.repository.GreetingsDatabaseRepository;

public class GreetingsService {

    private GreetingRepository repository;

    public GreetingsService(GreetingRepository repository) {
        this.repository = repository;
    }

    public String loadGreetings() {
        if (repository == null) {
            return "Hello!";
        }
        return repository.getGreeting();
    }
}
