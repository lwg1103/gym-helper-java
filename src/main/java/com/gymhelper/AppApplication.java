package com.gymhelper;

import com.gymhelper.domain.trainer.repository.*;
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
    public CommandLineRunner demo(TrainingRepository trainingRepository, ExerciseRepository excerciseRepository)
    {

        return (args) -> {
        };
    }
}
