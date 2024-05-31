package com.example.Collection.Map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Maps are an Interface. 
        // They are part of Collections -> Maps
        // Characteristics of Maps:
        // Objects are stored like in an ArrayList, bnut instead of indexes, every value has a key. key/value. 
        // Maps don't allow duplicate Objects. Every object has to use an unique key. 
        // HashMaps are a class that implement Map. 

        // HashMaps
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // HashMap Methods
        capitalCities.put("England", "London");     // Adds an Object with the specified key and value to the HashMap. Returns boolean.
        capitalCities.get("England");                     // Returns the Object that corresponds to the key. 
        capitalCities.remove("England");                  // Removes the Object with the corresponding key, if avaiable. Returns the removed Element. 
        capitalCities.clear();  	                          // Clears the HashMap. 
        capitalCities.size();                                 // Returns the size of the HashMap. 
        capitalCities.containsKey("England");             // Checks if a key exists. Retursns boolean. 
        capitalCities.containsValue("London");          // Checks if a value exists. Returns boolean. 

        // Print keys        
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
    }
}