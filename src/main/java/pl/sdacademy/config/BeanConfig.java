package pl.sdacademy.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.sdacademy.repository.GreetingRepository;
import pl.sdacademy.repository.GreetingsDatabaseRepository;
import pl.sdacademy.service.GreetingsService;

@Configuration
public class BeanConfig {

    @Bean
    public GreetingsDatabaseRepository dbRepository() {
        String jdbcUrl = "jdbc:mysql";
        return new GreetingsDatabaseRepository(jdbcUrl);
    }

    @Bean
    public GreetingsService greetingsDbService(@Qualifier("dbRepository") GreetingRepository repository) {
        return new GreetingsService(repository);
    }

    @Bean
    public GreetingsService greetingsMemoryService(@Qualifier("greetingsMemoryRepository") GreetingRepository repository) {
        return new GreetingsService(repository);
    }
}
