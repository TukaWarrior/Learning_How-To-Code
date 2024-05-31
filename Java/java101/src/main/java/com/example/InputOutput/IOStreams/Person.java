package com.example.InputOutput.IOStreams;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    public String name;
    public int age;
    public int size;

    public Person () {}
    public Person (String name, int age, int size){
        this.name = name;
        this.age = age;
        this.size = size;
    }
}
