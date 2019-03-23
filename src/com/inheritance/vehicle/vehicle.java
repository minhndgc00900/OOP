package com.inheritance.vehicle;

public class vehicle
{
    private String name;
    private String size;

    private int velocity;
    private int direction;

    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.velocity = 0;
        this.direction = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void steer(int d)
    {
        this.direction += d;
        System.out.println("direction now is " + direction);
    }

    public void move(int d, int v)
    {
        this.direction = d;
        this.velocity = v;
        System.out.println("the velocity of the vehicle is " + velocity + " and its direction is " + direction);
    }
}
