package pl.sdacademy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sdacademy.config.ApplicationConfig;
import pl.sdacademy.service.HelloService;

import java.util.Scanner;

public class Application {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        HelloService helloService = context.getBean(HelloService.class);

        System.out.println("Wpisz typ implementacji (db,memory):");
        String type = scanner.nextLine();
        helloService.sayHello(type);
    }
}
