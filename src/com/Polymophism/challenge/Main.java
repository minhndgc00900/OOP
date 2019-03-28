package com.Polymophism.challenge;

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car("toyota", 3);
        sportCar sportCar = new sportCar("ducati" , 4);
        van van = new van("honda van", 2);
        sedan sedan = new sedan("misubishi", 5);

        System.out.println(sportCar.startEngine());
        System.out.println(sportCar.accelerate());
        System.out.println(van.brake());
        System.out.println(sedan.startEngine());

    }

}
