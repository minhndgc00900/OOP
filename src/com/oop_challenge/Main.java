package com.oop_challenge;

public class Main
{
    public static void main(String[] args)
    {
        hamburger hamburger = new hamburger("mexico burger", "white", "pork" , 22.00);
        healthyBurger healthyBurger = new healthyBurger("beef", 16.0);
        deluxeBurger deluxeBurger = new deluxeBurger();

        System.out.println("the price of " + hamburger.getName() + " is $" + hamburger.itemizeBurger());
        hamburger.addtion1("tomato", 0.20);

        System.out.println("the price of " + hamburger.getName() + " is $" + hamburger.itemizeBurger() + "\n");


        System.out.println("the price of " + healthyBurger.getName() + " is $" + healthyBurger.itemizeBurger());

        healthyBurger.addHealthAddition1("penut", 0.2);
        healthyBurger.addHealthAddition2("salad", 1.3);

        System.out.println("the price of " + healthyBurger.getName() + " is $" + healthyBurger.itemizeBurger() + "\n");

        System.out.println("the price of " + deluxeBurger.getName() + " is $" + deluxeBurger.getPrice());
        deluxeBurger.addtion1("ddd", 2);
        deluxeBurger.addtion2("dad", 4);
        deluxeBurger.addtion3("dwqd", 5);
//        System.out.println("the price of " + deluxeBurger.getName() + " is $" + deluxeBurger.itemizeBurger());
    }

}
