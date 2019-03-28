package com.oop_challenge;

public class hamburger
{
    private String name;
    private String rollType;
    private String meat;
    private double price;

    public hamburger(String name, String rollType, String meat, double price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    private String name1;
    private double price1;
    private String name2;
    private double price2;
    private String name3;
    private double price3;
    private String name4;
    private double price4;

    public void addtion1(String name1, double price1)
    {
        this.name1 = name1;
        this.price1 = price1;
    }

    public void addtion2(String name2, double price2)
    {
        this.name2 = name2;
        this.price2 = price2;
    }

    public void addtion3(String name3, double price3)
    {
        this.name3 = name3;
        this.price3 = price3;
    }

    public void addtion4(String name4, double price4)
    {
        this.name4 = name4;
        this.price4 = price4;
    }

    public double itemizeBurger()
    {
        double hamburgerPrice = this.price;
//        System.out.println(this.name + " on a " + this.rollType + "roll,"
//                        + "price is $" + this.price);

        if(this.name1 != null)
        {
            hamburgerPrice += this.price1;
            System.out.println(this.price1 + "$ for " + this.name1 + " has been added");
        }
        if (this.name2 != null)
        {
            hamburgerPrice += this.price2;
            System.out.println(this.price2 + "$ for " + this.name2 + " has been added");
        }
        if (this.name3 != null)
        {
            hamburgerPrice += this.price3;
            System.out.println(this.price3 + "$ for " + this.name3 + " has been added");
        }
        if (this.name4 != null)
        {
            hamburgerPrice += this.price4;
            System.out.println(this.price4 + "$ for " + this.name4 + " has been added");
        }

        return hamburgerPrice;
    }
}
