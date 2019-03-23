package com.inheritance.vehicle;

public class car extends vehicle
{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public car(String name, String size, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = 1;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int curentGear){
        this.currentGear += curentGear;
        System.out.println("the current gear now is" + currentGear);
    }

    public void changeVelocity(int direction, int velocity)
    {
        super.move(direction, velocity);
        System.out.println("the car now can run " + velocity + " km/h " + " and the direction is " + direction);
    }
}
