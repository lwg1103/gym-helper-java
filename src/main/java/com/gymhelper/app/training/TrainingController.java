package com.gymhelper.app.training;

import com.gymhelper.app.BaseController;
import com.gymhelper.domain.training.model.Training;
import com.gymhelper.domain.training.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController extends BaseController
{
    @Autowired
    private TrainingRepository repository;

    @CrossOrigin
    @GetMapping("/training")
    public Iterable trainings()
    {
        return repository.findByUser(getCurrentUser());
    }

    @GetMapping("/training/{id}")
    public Training training(@PathVariable(value = "id") long id)
    {
        return repository.findById(id);
    }
}
