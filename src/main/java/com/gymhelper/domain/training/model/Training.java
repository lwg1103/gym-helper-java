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

    private String name;
    @OneToMany
    @OrderColumn
    private List<Excercise> excercises = new ArrayList<Excercise>();

    protected Training()
    {
    }

    public Training(String name)
    {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public List<Excercise> getExcercises()
    {
        return excercises;
    }

    public void addExcercise(Excercise excercise)
    {
        this.excercises.add(excercise);
    }

}
