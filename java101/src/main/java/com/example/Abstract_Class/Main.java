package com.example.Abstract_Class;

public class Main {
    public static void main(String[] args) {

        // An abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

        Pig pig1 = new Pig(); 
        pig1.animalSound();
        pig1.sleep();
        int test = pig1.age;
        System.out.println(test);
    }
}