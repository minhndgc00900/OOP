package com.inheritance.vehicle;

public class car extends vehicle
{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    public car(String name, int size, int doors, boolean isManual) {
        super(name, size);
        this.wheels = 4;
        this.doors = doors;
        this.gears = 1;
        this.isManual = isManual;
    }


    public void updateGears(int g)
    {
        this.gears = g;
        System.out.println("the number of gears now are " + this.gears);
    }

    public void updateMove(int speed, int direction)
    {
        System.out.println("the direction now is " + direction + " and speed is " + speed);
        super.move(speed, direction);
    }
}
