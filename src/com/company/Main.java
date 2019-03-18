package com.company;

public class Main {

    public static void main(String[] args) {
        //we have created new datatype (an object ) called civic which is a type of car
        Car honda = new Car();

        //if we create new datatype like this, because unlike  data types, there isnt default values with classes. =>
        //normally  we have to initialise them using the "new" =>
        //keyword
        //Car porche;

        //the car class  has inherited these from a base java class.
        honda.setModel("Carrera");
    }
}
