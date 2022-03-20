package com.gymhelper.domain.trainer.repository;

import com.gymhelper.domain.trainer.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUsername(String username);
}