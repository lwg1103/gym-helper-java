package com.gymhelper;

import com.gymhelper.domain.training.model.Training;
import com.gymhelper.domain.training.repository.TrainingRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(AppApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(TrainingRepository repository)
    {
        return (args) -> {
            repository.save(new Training("first training"));
            repository.save(new Training("second training"));
            repository.save(new Training("third training"));
        };
    }
}
