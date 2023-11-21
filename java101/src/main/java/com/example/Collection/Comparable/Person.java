package com.example.Collection.Comparable;

public class Person implements Comparable<Person>{

    // Fields
    private String name;
    private int age;

    // Constructors
    public Person(){}

    // Methods
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
    
    // Comparable method
    // To compare our own datatype (Person), we need to use and override the compareTo method of the Collection interfcace. 
    // The compareTo method is the one which gets called when you use Collections.sort(List with Persons). 
    // In it we define how the Collections.sort method will sort our own Objects. 
    @Override
    public int compareTo(Person n) {
        if (n.getAge() > this.age) return -1;
        if (n.getAge() == this.age) return 0;
        return 1;
    }
    // A compareTo method always needs a return type if none of the if conditions are met. 
    // Best practice is that if the value you compare to is smaller ,return -1. If it is equal, return 0. 
    // And if the value you are comparing to is bigger, return 1.


    // This is the comparable method if we want to sort out Persons by Name, instead of age. By String instead of Integer. 

}