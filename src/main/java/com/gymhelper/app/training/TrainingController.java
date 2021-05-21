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
    public Iterable trainings()
    {
        return repository.findAll();
    }

    @GetMapping("/training/{id}")
    public Training training(@PathVariable(value = "id") long id)
    {
        return repository.findById(id);
    }
}
