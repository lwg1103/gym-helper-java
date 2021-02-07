package com.gymhelper.domain.training.repository;

import com.gymhelper.domain.training.model.Training;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TrainingRepository extends CrudRepository<Training, Long>
{

    List<Training> findByName(String name);

    Training findById(long id);
}
