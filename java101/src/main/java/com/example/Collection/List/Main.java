package com.example.Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Lists are an Interface. 
        // They are part of Collections -> List
        // Characteristics of Lists:
        // Objects in the List are ordered. 
        // Lists allow dublicate Objects. The same Object can be in a list multiple times.
        // Lists grow and shrink automatically if the ammount of objects change. 

        // ArrayList
        ArrayList<String> cars = new ArrayList<>();
        // List 
        List <String> cars2 = new ArrayList<>(); // ArrayList implements the interface List. Using List allows easier change to another List type, like LinkedList.  

        // List Methods
        cars.add("Bently");                               // Adds an element at the end of the List. Method of Collections. Returns boolean.
        cars.add(1, "Alpha Romeo");           // Adds an element at the specified index. Returns void. 
        cars.set(0, "Chevrolet");             // Replaces an element at the specified index. 
        cars.remove(0);                               // Removes an element at the specified index. 
        cars.remove("Chevrolet");                         // Removes the first Object that fits the passed value, if avaiable. Returns boolean. 
        cars.clear();                                       // Clears the whole List. 
        cars.size();                                        // Returns the size of the List. 
        Collections.sort(cars);                             // Sort List. Method of Collections. 
        
        // Iterate over ArrayList using for loop
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // Iterate over ArrayList using for-each loop
        for (String j : cars) {
            System.out.println(j);
        }

        // IGNORE. This part uses the unused variables so it doesen't generate a compiler warning about unused variables. 
        System.out.println(cars2);
    }
}