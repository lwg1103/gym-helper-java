package com.gymhelper.domain.trainer.repository;

import com.gymhelper.domain.trainer.model.Exercise;
import org.springframework.data.repository.CrudRepository;

public interface ExerciseRepository extends CrudRepository<Exercise, Long>
{
    Exercise findById(long id);

    @Override
    <S extends Exercise> S save(S s);
}
