package com.gymhelper.domain.trainer.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Exercise implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private float weight;
    private int repeats;
    private int series;
    private int breakTime;
    @ManyToOne
    @JoinColumn(name = "training")
    private Training training;

    protected Exercise()
    {
    }

    public Exercise(String name, float weight, int repeats, int series, int breakTime, Training training)
    {
        this.name = name;
        this.weight = weight;
        this.repeats = repeats;
        this.series = series;
        this.breakTime = breakTime;
        this.training = training;

        training.addExercise(this);
    }

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public float getWeight()
    {
        return weight;
    }

    public int getRepeats()
    {
        return repeats;
    }

    public int getSeries()
    {
        return series;
    }

    public int getBreakTime()
    {
        return breakTime;
    }

    public Exercise setName(String name)
    {
        this.name = name;
        return this;
    }

    public Exercise setWeight(float weight)
    {
        this.weight = weight;
        return this;
    }

    public Exercise setRepeats(int repeats)
    {
        this.repeats = repeats;
        return this;
    }

    public Exercise setSeries(int series)
    {
        this.series = series;
        return this;
    }

    public Exercise setBreakTime(int breakTime)
    {
        this.breakTime = breakTime;
        return this;
    }
}
