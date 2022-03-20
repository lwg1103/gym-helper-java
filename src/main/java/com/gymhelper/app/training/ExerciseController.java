package com.gymhelper.app.training;

import com.gymhelper.app.BaseController;
import com.gymhelper.app.training.request.ExerciseEditRequest;
import com.gymhelper.domain.trainer.model.Exercise;
import com.gymhelper.domain.trainer.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
public class ExerciseController extends BaseController
{
    @Autowired
    private ExerciseRepository repository;

    @CrossOrigin
    @GetMapping("/exercise/{id}")
    public Exercise getExercise(@PathVariable(value = "id") long id)
    {
        return repository.findById(id);
    }

    @CrossOrigin
    @PutMapping("/exercise/{id}")
    public ResponseEntity<?> updateExercise(@PathVariable(value = "id") long id, @RequestBody ExerciseEditRequest request)
    {
        Optional<Exercise> exercise = Optional.ofNullable(repository.findById(id));

        if (exercise.isEmpty()) {
            return ResponseEntity.status(404).build();
        }

        exercise.get().setName(request.getName())
                .setWeight(request.getWeight())
                .setRepeats(request.getRepeats())
                .setBreakTime(request.getBreakTime())
                .setSeries(request.getSeries());

        repository.save(exercise.get());

        return ResponseEntity.ok().build();
    }
}
