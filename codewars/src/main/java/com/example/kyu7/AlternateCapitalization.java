package com.example.kyu7;

public class AlternateCapitalization {

    // Solution 1 - StringBuilder
    public static String[] capitalize(String s){
    
        StringBuilder evenString = new StringBuilder();
        StringBuilder unevenString = new StringBuilder();

        for (int index = 0; index <= s.length()-1; index++){
            char currentChar = s.charAt(index);

            if (index % 2 == 0) {
                evenString.append(Character.toUpperCase(currentChar));
                unevenString.append(currentChar);
            } else {
                evenString.append(currentChar);
                unevenString.append(Character.toUpperCase(currentChar));
            }
        }

        String[] returnString = {evenString.toString(), unevenString.toString()};
        return returnString;
    }
}

// Description
// Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.
// For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
// The input will be a lowercase string with no spaces.
// Good luck!