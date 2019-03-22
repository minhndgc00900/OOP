package com.class_and_constructor.company;

public class Main {

    public static void main(String[] args) {
        //we have created new datatype (an object ) called civic which is a type of car
        Car honda = new Car();

        //if we create new datatype like this, because unlike  data types, there isnt default values with classes. =>
        //normally  we have to initialise them using the "new" =>
        //keyword
        //Car porche;

        //the car class  has inherited these from a base java class.
        honda.setModel("MOMO");
        System.out.println(honda.getModel());
    }
}

//=>>> Car honda = new Car();
//explain more: this line means we create a new instance =>
//of the Car class. We assigning it (Car) to "honda" variable =>
//in other words it is  a reference to the object in memory.