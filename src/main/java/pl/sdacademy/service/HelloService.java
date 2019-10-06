package pl.sdacademy.service;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

    private GreetingsService greetingsDbService;
    private GreetingsService greetingsMemoryService;

    public HelloService(
            GreetingsService greetingsDbService,
            GreetingsService greetingsMemoryService) {
        this.greetingsDbService = greetingsDbService;
        this.greetingsMemoryService = greetingsMemoryService;
    }

    public void sayHello(String type) {
        String greeting;
        switch (type) {
            case "db":
                greeting = greetingsDbService.loadGreetings();
                break;
            case "memory":
                greeting = greetingsMemoryService.loadGreetings();
                break;
            default:
                throw new RuntimeException("Unknown type");
        }

        System.out.println(greeting);
    }
}
