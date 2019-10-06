package pl.sdacademy.service;

import pl.sdacademy.repository.GreetingRepository;

public class GreetingsService {

    private GreetingRepository repository;

    public GreetingsService(GreetingRepository repository) {
        this.repository = repository;
    }

    public String loadGreetings() {
        return repository.getGreeting();
    }
}
