package com.example.kyu5;

public class SimplePigLatin {

    public static String pigIt(String str) {

        // Split the string into words
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Check if the word is actually a punctuation mark
            if (word.matches("\\p{Punct}")) { // Check if the word is punctuation
                result.append(word);
            } else {
                // Move the first letter to the end and add "ay"
                String pigLatinWord = word.substring(1) + word.charAt(0) + "ay";
                result.append(pigLatinWord);
            }
            result.append(" "); // Add space between words
        }

        // Remove the last space and return the result
        return result.toString().trim();
    }
}

//Simple Pig Latin
//Description
//Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
//Examples
//pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//pigIt('Hello world !');     // elloHay orldway !
