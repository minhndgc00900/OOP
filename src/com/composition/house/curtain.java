package com.composition.house;

public class curtain
{
    private String brand;
    private info info;

    public curtain(String brand, info info) {
        this.brand = brand;
        this.info = info;
    }

    public void brandName(String brand)
    {
        System.out.println("the " + brand);
    }

}
