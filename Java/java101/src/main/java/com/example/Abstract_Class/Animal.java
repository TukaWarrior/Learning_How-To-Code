package com.example.Abstract_Class;

public abstract class Animal {

    // Abstract classes can have constructors, but the abstract class itself can no be used to instantiate an object. A child class is used for that. 
    public Animal() {};

    // An abstract class can have fields that are public. In contrast to Interfaces, which can only have private fields. 
    public int age = 10;

    // Abstract method (does not have a body). 
    // An abstract method can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
    public abstract void animalSound();

    // Regular method 
    public void sleep() {
        System.out.println("zzz");
    }

    // A class can only extend one abstract class. In contrast to Interfaces, whcih a class can implement multiple of. 
}
