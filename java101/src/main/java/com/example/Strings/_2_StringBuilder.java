package com.example.Strings;

public class _2_StringBuilder {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html

        // StringBuilder represents a mutable sequence of characters, unlike Strings, which are imutable.
        // It allows for easy and efficient modification of large text sequences.
        // StringBuilder is not Thread Safe, unlike StringBuffer, but faster and more efficient.

        StringBuilder strb = new StringBuilder(); // Create a new instance of StringBuilder.
        StringBuilder strb2 = new StringBuilder("Hello");
        String str = "World";

        System.out.println(strb.append(" ")); // The StingBuilder can append Strings.
        System.out.println(strb.append(str)); // The StingBuilder can append Strings.
        System.out.println(strb.append(1)); // The StrungBuilder can append primitive data types.
        System.out.println(strb.append(true)); // The StringBuilder can append boolean values.

        // StringBuilder methods are used to perform various actions with a StringBuilder. These are some useful ones.
        // StringBuilders also implement most of the String methods.

        System.out.println("append:             " + strb.append("I coffee")); //
        System.out.println("insert:             " + strb.insert(2, "need ")); // Inserts String at specified index.
        System.out.println("replace:            " + strb.replace(2, 6, "drink")); // Replaces the characters from startIndex to endIndex with the specified String.
        System.out.println("delete:             " + strb.delete(7, 14)); // Deletes the characters between startIndex to endIndex.
        System.out.println("reverse:            " + strb.reverse()); // Reverses the sequence of characters.
        System.out.println("length:             " + strb.length()); // Returns the length of the StringBuilder.
        System.out.println("capacity:           " + strb.capacity()); //Returns the current capacity of the StringBuilder.
    }
}