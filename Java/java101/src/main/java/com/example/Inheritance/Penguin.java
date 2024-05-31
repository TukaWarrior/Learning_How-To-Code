package com.example.Inheritance;

public class Penguin extends Bird {                 // Extend means it inherets attributes and methods from the superclass. 
    
    // Fields

    // Constructors
    public Penguin(){
    }

    public Penguin(String name, int age, String category) {
        super(name, age, category);                 // Calls the constructor of the superclass;
    }

    // Methods
    public void swim() {
        System.out.println("Penguins can swim");
    }
}