package pl.sdacademy.repository;

import org.springframework.stereotype.Component;

@Component
public class GreetingsMemoryRepository implements GreetingRepository {

    private String greeting = "Hello World!";

    public String getGreeting() {
        return greeting;
    }
}
