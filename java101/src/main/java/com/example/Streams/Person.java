package com.example.Streams;

public class Person {

    // Fields
    private String name;

    // Constructors
    public Person(){}

    public Person(String name){
        this.name = name;
    }

    // Methods
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}