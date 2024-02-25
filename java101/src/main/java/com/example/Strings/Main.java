package com.example.Strings;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Strings are objects that represent a sequence of characters. In Java, Strings are not a primitive data types but are instances of the String class.

        String str1 = "Hello World"; // Strings are stored in a "common pool" for String literals.
        String str2 = "Hello World"; // These two Strings (str1 and str2) point to the same object.
        String str3 = new String("Hello World"); // Creating a new String will make it point to a new String object.

        // String methods are used to perform various actions with a string.
        String str = " Hello World ";
        System.out.println(str.toUpperCase()); // Converts characters to upper case.
        System.out.println(str.toLowerCase()); // Converts characters to lower case.
        System.out.println(str.length()); // Returns the number of characters.
        System.out.println(str.trim()); // Removes leading and trailing whitespaces.
        System.out.println(str.charAt(3)); // Returns the character at specified index.
        System.out.println(str.substring(1, 6)); // Returns a new String that contains the specified substring (beginIndex, endIndex).
        System.out.println(str.contains("Hello")); // Returns boolean if String contains specified sequence of characters.
        System.out.println(str.equalsIgnoreCase(" hello world ")); // Compares two strings but ignores case considerations.
        System.out.println(str.replace("World", "Moon")); // Replaces all matching character sequences (oldChar, newChar).
        System.out.println(str.concat("and Moon")); // Concatenates multiple Strings
        System.out.println(str.startsWith(" W")); // Returns boolean if the String starts with the specified prefix.
        System.out.println(str.endsWith("d ")); // Returns boolean if the String ends with the specified suffix.
        System.out.println(str.codePointAt(0)); // Returns the unicode code point of the character at the specified index.
    }
}