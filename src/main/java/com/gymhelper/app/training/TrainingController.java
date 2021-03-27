package com.gymhelper.app.training;

import com.gymhelper.domain.training.model.Training;
import com.gymhelper.domain.training.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController
{

    @Autowired
    private TrainingRepository repository;

    @CrossOrigin
    @GetMapping("/init")
    public void init()
    {
        repository.save(new Training("first training"));
        repository.save(new Training("second training"));
        repository.save(new Training("third training"));
    }

    @CrossOrigin
    @GetMapping("/training")
    public Training[] trainings()
    {
        Training t1 = new Training("1 training");
        Training t2 = new Training("2 training");
        Training t3 = new Training("3 training");

        return new Training[]{t1, t2, t3};
    }

    @GetMapping("/training/{id}")
    public Training training(@PathVariable(value = "id") long id)
    {
        return repository.findById(id);
    }
}
