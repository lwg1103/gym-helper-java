package com.gymhelper.app.training.request;

public class ExerciseEditRequest
{
    private final String name;
    private final float weight;
    private final int repeats;
    private final int series;
    private final int breakTime;

    public ExerciseEditRequest(String name, float weight, int repeats, int series, int breakTime)
    {
        this.name = name;
        this.weight = weight;
        this.repeats = repeats;
        this.series = series;
        this.breakTime = breakTime;
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
}
