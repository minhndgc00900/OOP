package com.oop_challenge;

public class deluxeBurger extends hamburger
{
    public deluxeBurger() {
        super("deluxe", "yellow", "fish", 17.0);
        super.addtion1("drink", 3.2);
        super.addtion2("chip", 1.31);
    }

    @Override
    public void addtion1(String name1, double price1) {
        System.out.println("cannot do anything");
        //sort "super." out and leave the override method blank to disable overriding method
    }

    @Override
    public void addtion2(String name2, double price2) {
        System.out.println("cannot do anything");
    }

    @Override
    public void addtion3(String name3, double price3) {
        System.out.println("cannot do anything");
    }

    @Override
    public void addtion4(String name4, double price4) {

    }
}
