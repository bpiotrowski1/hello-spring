package pl.sdacademy;

import pl.sdacademy.repository.GreetingRepository;
import pl.sdacademy.repository.GreetingsDatabaseRepository;
import pl.sdacademy.repository.GreetingsMemoryRepository;
import pl.sdacademy.service.GreetingsService;

public class Application {

    public static void main(String[] args) {
        String source = "db";

        GreetingRepository repository;

        switch (source) {
            case "db":
                repository = new GreetingsDatabaseRepository("jdbc:mysql");
                break;
            case "memory":
                repository = new GreetingsMemoryRepository();
                break;
            default:
                throw new RuntimeException();
        }

        GreetingsService greetingsService = new GreetingsService(repository);

        String greeting = greetingsService.loadGreetings();
        System.out.println(greeting);
    }
}
