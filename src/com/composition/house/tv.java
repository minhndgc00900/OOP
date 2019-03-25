package com.composition.house;

public class tv
{
    private String tvName;
    private String colour;
    private size size;

    public tv(String tvName, String colour, size size) {
        this.tvName = tvName;
        this.colour = colour;
        this.size = size;
    }

    public void tvInfo(String name, String colour)
    {
        System.out.println("the " + name + " has " + colour);
    }


}
