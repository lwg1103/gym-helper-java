package com.gymhelper;

import com.gymhelper.domain.training.repository.*;
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
    public CommandLineRunner demo(TrainingRepository trainingRepository, ExcerciseRepository excerciseRepository)
    {
//        excerciseRepository.deleteAll();
//        trainingRepository.deleteAll();

        return (args) -> {
//            Training t1 = new Training("first training");
//            trainingRepository.save(t1);
//            excerciseRepository.save(new Excercise("excercise one", 0, 15, 3, 60, t1));
//            excerciseRepository.save(new Excercise("excercise two", 7, 12, 3, 90, t1));
//            trainingRepository.save(t1);
//
//            trainingRepository.save(new Training("second training"));
//            trainingRepository.save(new Training("third training"));
        };
    }
}
