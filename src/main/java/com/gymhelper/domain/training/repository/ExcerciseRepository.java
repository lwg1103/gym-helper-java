package com.gymhelper.domain.training.repository;

import com.gymhelper.domain.training.model.Exercise;
import org.springframework.data.repository.CrudRepository;

public interface ExcerciseRepository extends CrudRepository<Exercise, Long>
{

//    List<Training> findByName(String name);
//
//    Training findById(long id);
}
