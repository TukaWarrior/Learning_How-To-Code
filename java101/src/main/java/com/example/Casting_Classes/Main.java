package com.example.Casting_Classes;

public class Main {
    public static void main(String[] args) {

        // Due to inheritance and implementantions, an object can be of multiple different types. 
        // Meaning that there are multiple implementations of the same method for an object. 

        // Every class is always an child class of the Java class Object, even if not specified. 
        // Meaning every instanceof a class is also always of the type Object. 

        // If we create an instance of Pig with the typo Object (instead of Animal), it only can access methods of the Object class. 
        // The Object class implements a toString method. But calling the animalSound() method creates an compile error, 
        // because the instance pig1 of the type Object doesen't have such a method (because it gets implemented in the Animal class)
        // Object -> Animal -> Pig --> pig1

        Object pig1 = new Pig(); 
        System.out.println(pig1.toString());
        // pig1.animalSound();

        // The Object and the Animal class booth implement a toString method. 
        // Because toString is an method that gets called on an instance, not the class itself, which one is used is decided at runtime. 
        // Java tries to call the lowest implementation of the method. In this case, it is the toString from the class Animal, because Animal is lower than Object. 

        // If we want to call the method animalSound() on an instance of Object, we have to cast the instance into the type Animal. 
        // Downcasting
        Animal pig1new = (Animal) pig1;
        pig1new.animalSound();

        // Upcasting is when we want to cast an instance into the type of it's parent/super class. 
        // Doing this means we loose access to the methods implemented by it's child class. 
        // Upcasting
        Animal pig2 = new Pig(); 
        Object pig2new = (Object) pig2;
        // pig2new.animalSound();
        //ClassCastExeption 
        Object pig3 = new Object();
        
        // Animal pig3new = (Animal) pig3;
        // This throws an ClassCastExeption error because the instance pig1 never implemented the class Animal. (It got created as a new Object, not as a new Pig). 
        // To use casting, an instance must implement the class it is casted to. 

        // Inline Notation
        Object pig4 = new Pig();
        ((Animal)pig4).animalSound();
        // This is another notation to cast an object. 

        // The instanceof Operator checks if an instance is of a given type.
        if (pig1 instanceof Object && pig1 instanceof Animal && pig1 instanceof Pig) {
            System.out.println("pig1 is an instance of Object, Animal and Pig");
        }


        // IGNORE: This is just here so the variable are used to avoid compilation warnings about unused variables. 
        pig2new.toString();
        pig3.toString();
    }
}