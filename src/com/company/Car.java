package com.company;

public class Car
{//state component (or a field) (State and behaviour)
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model)
    {
        //the word 'this' when you're refering  to the field  of the class
        //update the "model" variable with the contents  of the parameter 'model' that was passed to us =>
        //instead of accessing directly
        this.model = model;
    }
}
