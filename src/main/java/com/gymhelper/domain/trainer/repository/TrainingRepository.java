package com.gymhelper.domain.trainer.repository;

import com.gymhelper.domain.trainer.model.Training;
import java.util.List;

import com.gymhelper.domain.trainer.model.User;
import org.springframework.data.repository.CrudRepository;

public interface TrainingRepository extends CrudRepository<Training, Long>
{

    List<Training> findByName(String name);

    Training findById(long id);

    List<Training> findByUser(User currentUser);
}
