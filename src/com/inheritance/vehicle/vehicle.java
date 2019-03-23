package com.inheritance.vehicle;

public class vehicle
{
    private String name;
    private int size;
    private int speed;
    private int direction;

    public vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        this.speed = 0;
        this.direction = 0;
    }

    public void updateDirection(int direction)
    {
        this.direction += direction;
        System.out.println("the new direction now is " + this.direction + " degree");
    }

    public void move(int speed, int direction)
    {
        this.speed = speed;
        this.direction = direction;

    }

    public void stop()
    {
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }
}
