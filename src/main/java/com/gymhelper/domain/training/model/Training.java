package com.gymhelper.domain.training.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Training implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    protected Training()
    {
    }

    public Training(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

}
