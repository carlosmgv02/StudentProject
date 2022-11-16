package com.DemoAmigos.amigosDemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student carlos = new Student(
                    "carlos",
                    "carlos.martinezg@gmail.com",
                    LocalDate.of(2002, MAY, 15),
                    20
            );
            Student david = new Student(
                    "david",
                    "david.marti@gmail.com",
                    LocalDate.of(2002, MAY, 24),
                    20
            );
            repository.saveAll(
                    List.of(carlos, david)
            );
        };
    }
}
