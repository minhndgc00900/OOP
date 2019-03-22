package com.class_and_constructor.house;

public class main
{
    public static void main(String[] args) {
        house house = new house("blue");
        house anotherHouse = house;

        System.out.println(house.getColour());

        house.setColour("green");

        System.out.println(house.getColour());

        System.out.println(anotherHouse.getColour());

        house yh = new house("yellow");

        anotherHouse = yh;

        System.out.println(anotherHouse.getColour());


    }
}
