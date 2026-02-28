package com.example.cgisuvepraktikaproovitoo2026;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class CgiSuvepraktikaProovitoo2026Application {

    public static void main(String[] args) {
        SpringApplication.run(CgiSuvepraktikaProovitoo2026Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(Environment env) {
        return args -> {
            System.out.println("Database URL: " + env.getProperty("spring.datasource.url"));
        };
    }

}
