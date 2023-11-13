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