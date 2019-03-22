package com.inheritance;

public class Dog extends Animal
{//"extends" here indicates that this class (Dog) is extending =?
    //from the super class or big class (Animal). Thats called inheritance
    //this allows us to initialise the "dog" class based on Animal class
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat)
    {
        //"super" here means to call to constructor that is for the class =>
        //we're exending from.
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew()
    {
        System.out.println("dog chew");

    }

    @Override
    public void eat() {
        System.out.println("dog eat");
        chew();
        super.eat();
    }

    public void walk()
    {
        System.out.println("dog is walking");
        super.move(5);
    }

    public void run()
    {
        System.out.println("dog is running");
        super.move(10);
    }

    private void moveLeg()
    {
        System.out.println("dog is moving its legs");
    }

    @Override
    public void move(int speed) {
        moveLeg();
        super.move(speed);
    }


    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }
}
