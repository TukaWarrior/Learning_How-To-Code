package com.example.Inheritance;

public class Parrot extends Bird {                  // Extend means it inherets attributes and methods from the superclass. 

    // Fields
    String color;

    // Constructors
    public Parrot(){
    }

    public Parrot(String name, int age, String category, String color) {
        super(name, age, category);                 // Calls the constructor of the superclass;
        this.color = color;
    }

    // Methods
    @Override                                       // Overrides the eat() method from the superclass. 
    public void eat() {
        System.out.println("I eat fish");
    }

    public void fly() {
        System.out.println("Parrots can fly");
    }

    public void speak() {
        System.out.println("Parrots can speak");
    }
}