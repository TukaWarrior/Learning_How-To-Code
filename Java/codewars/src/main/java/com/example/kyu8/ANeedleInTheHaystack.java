package com.example.kyu8;

public class ANeedleInTheHaystack {

    // Solution 1 - Cast Object to String, String equals.  
    public static String findNeedle(Object[] haystack) {

        String returnValue =  "found the needle at position ";
        int index = 0;

        for (Object obj : haystack) {

            if (obj instanceof String) {
                String str = (String) obj;
                
                if (str.equals("needle")) {
                returnValue += index;
                return returnValue;
                }
            }
            index++;
        }
        return "no needle found";
    }
}

// Description
// Can you find the needle in the haystack?
// Write a function findNeedle() that takes an array full of junk but containing one "needle"
// After your function finds the needle it should return a message (as a string) that says:
// "found the needle at position " plus the index it found the needle, so:
// Example(Input --> Output)
// ["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"