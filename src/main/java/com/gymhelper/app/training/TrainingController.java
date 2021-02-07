package com.gymhelper.app.training;

import com.gymhelper.domain.training.model.Training;
import com.gymhelper.domain.training.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController
{

    @Autowired
    private TrainingRepository repository;

    @GetMapping("/training")
    public Training[] trainings()
    {
        Training t1 = new Training("first training");
        Training t2 = new Training("second training");
        Training t3 = new Training("third training");

        return new Training[]{t1, t2, t3};
    }

    @GetMapping("/training/{id}")
    public Training training(@PathVariable(value = "id") long id)
    {
        return repository.findById(id);
    }
}
