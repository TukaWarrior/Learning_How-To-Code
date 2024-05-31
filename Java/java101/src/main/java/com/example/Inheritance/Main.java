package com.example.Inheritance;

public class Main {
    public static void main(String[] args) {

        // Inheritance means that classes (subclasses) can inhert attributes and methods from other classes (superclass). 
        // Subclasses can add additional attributes and methods or alter existing methods. 
        // Meaning subclasses can have variables and methods that their superclass does not have. 

        // Cretae object / instance of class
        Bird bird1 = new Bird("Duo", 10, "Bird");
        Parrot parrot1 = new Parrot("Iago", 4, "Parrot", "multi-colored");
        Owl owl1 = new Owl("Hooty", 5, "Owl", "Forest");
        Penguin penguin1 = new Penguin("Skipper", 8, "Penguin");

        // Accessing variables of instances
        System.out.println(bird1.name + " is a " + bird1.category);
        System.out.println(parrot1.name + " is a " + parrot1.category);
        System.out.println(owl1.name + " is an " + owl1.category);
        System.out.println(penguin1.name + " is a " + penguin1.category);

        // Calling methods of instances
        bird1.eat();
        parrot1.eat();
        parrot1.speak();
        owl1.fly();
        penguin1.swim();
    }
}