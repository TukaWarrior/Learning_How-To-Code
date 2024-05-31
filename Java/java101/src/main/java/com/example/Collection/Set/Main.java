package com.example.Collection.Set;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // Sets are an Interface. 
        // They are part of Collections -> Set
        // Characteristics of Sets:
        // Objects in the Set are unordered. A set is a mathematical quantity. (Like a pool of values) 
        // Sets don't allow dublicate Objects. 
        // HashSets are a class that implement the interface Set
        // A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

        // HashSet
        HashSet<String> cars = new HashSet<String>();

        // HashSet Methods
        cars.add("Bently");                               // Adds an element to the Hash Set. Returns boolean. 
        cars.remove("Chevrolet");                         // Removes an element from the HashSet. Returns boolean. 
        cars.clear();                                       // Clears the whole HashSet. 
        cars.size();                                        // Returns the size of the HashSet. 
        cars.contains("Bently");                          // Checks if an Object exists in the HashSet. Returns boolean

        // Iterate through a HashSet using for-each loop
        for (String i : cars) {
            System.out.println(i);
        }
    }
}