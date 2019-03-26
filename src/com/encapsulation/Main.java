package com.encapsulation;


public class Main {

    public static void main(String[] args)
    {
        gamePlayer gamePlayer = new gamePlayer("Ryu", 90);
        System.out.println(gamePlayer.getName() + " has " + gamePlayer.getHealth() + " health");

        gamePlayer.healthRemain(14);
    }
}
