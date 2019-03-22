package com.inheritance;

public class Main
{
    public static void main(String[] args)
    {
        Animal animal = new Animal("Tiger", 1, 1, 12, 38);
        Dog dog = new Dog("Nicky", 13, 39, 2, 4, 1, 10 , "ddd");
        Fish fish = new Fish("Nemo", 13, 39, 2, 4, 1);

        System.out.println("animal identity " + animal.getName() + animal.getBrain() + animal.getBody() + animal.getSize() + animal.getWeight());

        System.out.println("dog identity " + dog.getName());
        animal.eat();
        dog.eat();

//        dog.walk();
        dog.run();

        dog.move(15);

        fish.move(5);
    }
}
