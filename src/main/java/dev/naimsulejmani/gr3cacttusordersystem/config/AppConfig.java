package dev.naimsulejmani.gr3cacttusordersystem.config;

import dev.naimsulejmani.gr3cacttusordersystem.repositories.data_initializer.ProductInitializer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ApplicationRunner applicationRunner(ProductInitializer di) {
        return args -> di.run();
    }
}
