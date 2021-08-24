package com.gymhelper.domain.training.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Training implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user")
    private User user;

    private String name;
    @OneToMany
    @OrderColumn
    private final List<Exercise> exercises = new ArrayList<Exercise>();

    protected Training()
    {
    }

    public Training(User user, String name)
    {
        this.user = user;
        this.name = name;
    }

    public Long getId()
    {
        return id;
    }

    public User getUser()
    {
        return user;
    }

    public String getName()
    {
        return name;
    }

    public List<Exercise> getExercises()
    {
        return exercises;
    }

    public void addExercise(Exercise exercise)
    {
        this.exercises.add(exercise);
    }

}
