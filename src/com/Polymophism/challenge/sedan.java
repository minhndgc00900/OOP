package com.Polymophism.challenge;

public class sedan extends Car
{
    public sedan(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "sedan is starting engine";
    }

    @Override
    public String accelerate() {
        return "sedan is speeding";
    }

    @Override
    public String brake() {
        return "sedan is braking";
    }
}
