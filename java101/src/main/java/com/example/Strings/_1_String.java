package com.example.Strings;

public class _1_String {
    public static void main(String[] args) {

        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        // https://www.w3schools.com/java/java_strings.asp

        // Strings are objects that represent a sequence of characters. In Java, Strings are not a primitive data types but are instances of the String class.

        String str = " Hello World "; // Strings are stored in a "common pool" for String literals.
        String str2 = " Hello World "; // These two Strings (str1 and str2) point to the same object.
        String str3 = new String("Hello World"); // Creating a new String will make it point to a new String object.

        // String methods are used to perform various actions with a string. These are some useful ones.

        // Meassure / Find
        System.out.println("length:             " + str.length()); // Returns the number of characters.
        System.out.println("charAt:             " + str.charAt(3)); // Returns the character at specified index. Strings starts at index 0.
        System.out.println("indexOf:            " + str.indexOf("World"));

        // Modify
        System.out.println("toUpperCase:        " + str.toUpperCase()); // Returns String. Converts characters to upper case.
        System.out.println("toLowerCase:        " + str.toLowerCase()); // Returns String. Converts characters to lower case.
        System.out.println("concat:             " + str.concat("and Moon")); // Returns String. Concatenates multiple Strings.
        System.out.println("trim:               " + str.trim()); // Removes leading and trailing whitespaces.
        System.out.println("substring:          " + str.substring(1, 6)); // Returns String that contains the specified substring (beginIndex, endIndex).
        System.out.println("replace:            " + str.replace("World", "Moon")); // Returns String. Replaces all matching character sequences (oldChar, newChar).
        System.out.println("replaceFirst:       " + str.replaceFirst("World", "Moon")); // Returns String. Replaces the first occurrence of a substring that matches the given regular expression with the specified replacement.
        System.out.println("replaceAll:         " + str.replaceAll("World", "Moon")); // Returns String. Replaces all occurrence of a substring that matches the given regular expression with the specified replacement.

        // Contains / Compares
        System.out.println("contains:           " + str.contains("Hello")); // Returns boolean if String contains specified sequence of characters.
        System.out.println("equals:             " + str.equals("Hello")); // Returns boolean. Compares two Strings.
        System.out.println("equalsIgnoreCase:   " + str.equalsIgnoreCase(" hello world ")); // Returns boolean. Compares two strings, ignoring case considerations.
        System.out.println("startsWith:         " + str.startsWith(" W")); // Returns boolean if the String starts with the specified prefix.
        System.out.println("endsWith:           " + str.endsWith("d ")); // Returns boolean if the String ends with the specified suffix.
        System.out.println("isEmpty:            " + str.isEmpty()); // Returns Boolean. Checks whether a String is empty or not.
        System.out.println("isBlank:            " + str.isBlank()); // Returns Boolean. Checks whether a String is empty, ignoring whitespaces.

        // Compare lexicographically (Which comes first in a dictionary).
        System.out.println("compareTo:           " + str.compareTo(" Hdllo World ")); // Compares two Strings lexicographically. (Which comes first in a dictionary(-before, +after).
        System.out.println("compareToIgnoreCase: " + str.compareToIgnoreCase(" hfllo world ")); // Compares two Strings lexicographically, ignoring case differences.(Which comes first in a dictionary(-before, +after)).

        // Unicode
        System.out.println("codePointAt:        " + str.codePointAt(0)); // Returns the Unicode of the character at the specified index.
        System.out.println("codePointBefore:    " + str.codePointBefore(1)); // Returns the Unicode of the character before the specified index.
        System.out.println("codePoointCount:    " + str.codePointCount(0, 6)); // Returns the number of Unicode values found in a String (beginIndex, endIndex).
    }
}