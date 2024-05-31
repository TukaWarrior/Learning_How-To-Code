package com.example.Inheritance;

public class Bird {

    // Fields
    String name;
    int age;
    String category;

    // Constructors
    public Bird() {
    }

    public Bird (String name, int age, String category) {
        this.name = name;
        this.age = age;
        this.category = category;
    }

    // Methods
    public void eat() {
        System.out.println("I eat all kinds of food");
    }

    public void sleep() {
        System.out.println("I sleep wherever I can");
    }
}