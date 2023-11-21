package com.example.Inheritance;

public class Owl extends Bird {                     // Extend means it inherets attributes and methods from the superclass. 
    
    // Fields
    String area;

    // Constructors
    public Owl() {
    }

    public Owl(String name, int age, String category, String area) {
        super(name, age, category);                 // Calls the constructor of the superclass;
        this.area = area;
    }

    // Methods
    public void fly() {
        System.out.println("Owls can fly");
    }
}