package com.example.Interface;

public class Main {
    public static void main(String[] args) {

        // An interface is a completely "abstract class" that is used to group related methods with empty bodies. 
        // The class Dog implements the interface Animal. 
        // It means that the Dog class must have all methods defined that are in the implemented interface. 

        // Cretae object / instance of class
        Dog dog1 = new Dog();

        // Calling methods of instances
        dog1.animalSound();
        dog1.eat();
    }
}