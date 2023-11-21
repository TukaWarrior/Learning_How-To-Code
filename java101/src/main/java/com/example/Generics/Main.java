package com.example.Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Instance of Animal where atribute holds a Integer
        System.out.println("Animal 1 with Integers: ");
        Animal<Integer> animal1 = new Animal<Integer>();
        animal1.setGenericAttribute(1);
        System.out.println(animal1.getGenericAttribute());

        // Instance of Animal where atribute holds a String
        System.out.println("Animal 2 with Strings: ");
        Animal<String> animal2 = new Animal<String>();
        animal2.setGenericAttribute("Pig");
        System.out.println(animal2.getGenericAttribute());

        // Due to the class and field being generic, the attribute variable of animal instances can hold an Integer for animal1 and a String for animal2. 

        // If te Generic Class multiple generic variables, all of them must be defined when creating a new instance of that class.
        System.out.println("Animal 3 with two generic variables: ");
        Animal2<String, Integer> animal3 = new Animal2<String, Integer>();
        animal3.setGenericAttribute1("Dog");
        animal3.setGenericAttribute2(5);
        System.out.println(animal3.getGenericAttribute1());
        System.out.println(animal3.getGenericAttribute2());


        // Calling generic methods
        // The generic method is defined below and it can return any type of value. 
        System.out.println("Calling a generic method that prints arrays of multiple types: ");
        Integer[] integerArray = {1, 2, 3};
        String[] stringArray = {"One", "Two", "Three"};
        printArray(integerArray);
        printArray(stringArray);


        // Wildcards
        // There are two types of wildcards <>. Unbounded and bounded. They are used to limit the datatype that can be used. 
        // The <?> represents an unbound wildcard. This example demonstrates that the array1 is of generic type, but does not define which exactly must be used. 
        // Because of this, the array1 can be defined multiple times with different types without causing a compilation error. 
        ArrayList<?> array1 = new ArrayList<Integer>();
        array1 = new ArrayList<Double>();

        // IGNORE. This part uses the unused variables so it doesen't generate a compiler warning about unused variables. 
        array1.add(null);

        // Unbound Wildcards
        System.out.println("Unbound Wildcards: ");
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("One");
        arrayList2.add("Two");
        arrayList2.add("Three");
        printList(arrayList1);
        printList(arrayList2);

        // Upper Bounded Wildcards
        System.out.println("Upper Bounded Wildcards <? extends type>: ");
        sumOfList(arrayList1);

        // Lower Bounded Wildcard
        System.out.println("Lower Bounded Wildcards <? super type>: "); 

    }

    // Generic methods
    // This method returns a generic type. Meaning it's return value can be of any type.
    public static <T> void printArray(T[] array){
        for (T arrayitem : array){
            System.out.println(arrayitem);
        }
    }

    // This unbounded method returns any type. 
    public static void printList (ArrayList<?> list){
        for (Object element : list){
            System.out.println(element);
        }
    }

    // This method uses an upper bounded wilcard. 
    // This means that only types are supported that inheret from the extended class. 
    // E.g this method allows all subtypes of Number.
    // Object -> Number -> Integer, Double, Long, Float, Short, Byte
    //                     -------  ------  ----  -----  -----  ----                    

    public static void sumOfList(ArrayList<? extends Number> arrayList){
        double s = 0.0;
        for (Number n : arrayList){
            s += n.doubleValue();
            
        }
        System.out.println("Sum of " + arrayList + ": " + s);
    }

    // This method uses a lower bounded wildcard. 
    // This means that only types are supported that are supertypes of the specified class or from the class itself. 
    // E.g. this method allows any type that is a supertype of Integer.
    // Object -> Number -> Integer --> int
    // ------    ------    -------
    public static void addNumbers(ArrayList<? super Integer> arrayList){
        for (int i = 1; i <= 10; i++){
            arrayList.add(i);
        }
    }
}