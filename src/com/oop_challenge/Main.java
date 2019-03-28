package com.oop_challenge;

public class Main
{
    public static void main(String[] args)
    {
        hamburger hamburger = new hamburger("mexico burger", "white", "pork" , 22.00);

        System.out.println("the price of " + hamburger.getName() + " is $" + hamburger.getPrice());
        hamburger.addtion1("tomato", 0.20);

        System.out.println("the price of " + hamburger.getName() + " is $" + hamburger.itemizeBurger());


    }

}
