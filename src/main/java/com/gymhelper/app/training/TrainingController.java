package com.gymhelper.app.training;

import com.gymhelper.app.BaseController;
import com.gymhelper.domain.trainer.model.Training;
import com.gymhelper.domain.trainer.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrainingController extends BaseController
{
    @Autowired
    private TrainingRepository repository;

    @CrossOrigin
    @GetMapping("/training")
    public Iterable getTrainings()
    {
        return repository.findByUser(getCurrentUser());
    }

    @CrossOrigin
    @GetMapping("/training/{id}")
    public Training getTraining(@PathVariable(value = "id") long id)
    {
        return repository.findById(id);
    }
}
