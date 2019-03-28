package com.Polymophism.challenge;

public class sportCar extends Car
{
    public sportCar(String name, int cylinders) {
        super(name, cylinders);
    }

//    @Override
//    public String getName() {
//        return super.getName();
//    }

    @Override
    public String startEngine() {
        return  getName() +" is starting engine";
    }

    @Override
    public String accelerate() {
        return "The race car is speeding";
    }

    @Override
    public String brake() {
        return "The race car is braking";
    }
}
