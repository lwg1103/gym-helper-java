package com.gymhelper.domain.training.repository;

import com.gymhelper.domain.training.model.Excercise;
import org.springframework.data.repository.CrudRepository;

public interface ExcerciseRepository extends CrudRepository<Excercise, Long>
{

//    List<Training> findByName(String name);
//
//    Training findById(long id);
}
