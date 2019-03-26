package com.encapsulation;

public class gamePlayer
{
    private String name;
    private int health;

    public gamePlayer(String name, int health) {
        this.name = name;

        if (health > 0 && health <= 100)
        {
            this.health = health;
        }
        else
        {
            this.health = 100;
        }

    }

    public void healthRemain(int damage)
    {
        this.health = this.health - damage;
        System.out.println("the player now remain " + this.health + " health ");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
