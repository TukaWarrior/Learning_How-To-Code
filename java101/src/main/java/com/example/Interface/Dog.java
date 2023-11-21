package com.example.Interface;

public class Dog implements Animal {                    // Implement means that the interface gets implemented.
    
    public void animalSound() {
        System.out.println("The dog makes woof");
    }

    public void eat() {
        System.out.println("The dog eats food");
    }
}