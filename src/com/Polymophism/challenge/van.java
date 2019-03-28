package com.Polymophism.challenge;

public class van extends Car
{
    public van(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "The van is starting engine";
    }

    @Override
    public String accelerate() {
        return "The van is speeding";
    }

    @Override
    public String brake() {
        return "The van is braking";
    }
}
