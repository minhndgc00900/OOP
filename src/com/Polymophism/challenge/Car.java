package com.Polymophism.challenge;

public class Car
{
     private String name;
     private int wheels;
     private int cylinders;
     private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.engine = true;
    }

    public String startEngine()
    {
        return "The engine is started";
    }

    public String accelerate()
    {
        return "The car is accelerating";
    }

    public String brake()
    {

        return "brake is opened";
    }

    public String getName()
    {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }
}
