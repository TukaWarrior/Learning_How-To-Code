package com.example.Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        // Sorting of collections is simple. The sort method of Collections can be used. 
        ArrayList<String> names = new ArrayList<String>();
        names.add("Peter");
        names.add("Aaron");
        Collections.sort(names);

        // However, if we want to sort a list with out own data type (like Objects), we need to implement the Comparable interface. 
        // Check out the Name.java

        // Lets create some People with names and ages. 
        Person name1 = new Person();
        name1.setName("Cloe");
        name1.setAge(20);
        Person name2 = new Person();
        name2.setName("Beatrice");
        name2.setAge(18);
        Person name3 = new Person();
        name3.setName("Aaron");
        name3.setAge(25);

        // Now add them to an ArrayList
        ArrayList<Person> personList = new ArrayList<Person>();
        personList.add(name1);
        personList.add(name2);
        personList.add(name3);

        // Print out the People. They will be unsorted. 
        System.out.println("\nUnsorted:");
        for (Person n : personList){
            System.out.println(n.getName() + " is " + n.getAge());
        }

        // Sort the Objects. 
        Collections.sort(personList);

        // Print out the now sorted list of People. 
         System.out.println("\nSorted by Age:");
        for (Person n : personList){
            System.out.println(n.getName() + " is " + n.getAge());
        }

        // If you want to sort by name, you can implement a comparator method within an anonymous class within the main method or within a separate class. 
        // Here, it is implemented as an anonymous clalss (a class without a name for a one time use only). 
        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return person1.getName().compareTo(person2.getName());
            }
        });


        // Print out the now sorted list of People by name
        System.out.println("\nSorted by Name:");
        for (Person n : personList) {
            System.out.println(n.getName() + " is " + n.getAge());
        }
    }
}