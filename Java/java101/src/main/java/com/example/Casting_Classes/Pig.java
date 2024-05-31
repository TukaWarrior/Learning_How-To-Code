package com.example.Casting_Classes;

public class Pig implements Animal { 

    public void animalSound() { 
        System.out.println("Oink");
    }

    public String toString() {
        return "The pig makes Oink";
    }
}