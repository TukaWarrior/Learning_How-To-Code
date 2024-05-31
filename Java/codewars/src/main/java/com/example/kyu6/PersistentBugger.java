package com.example.kyu6;

import java.util.ArrayList;

public class PersistentBugger {
    
    // Solution 1 - While Loop: String > CharList > Calculation
    public static int persistence(long n) {

        String numberString = Long.toString(n);
        int persistence = 0;

        while (numberString.length() > 1) {
            ArrayList<Integer> intArrayList = new ArrayList<>();

            for (int i = 0; i < numberString.length(); i++) {
                intArrayList.add(Character.getNumericValue(numberString.charAt(i)));
            }

            long summary = 1;
            for (int i : intArrayList) {
                summary = (summary * i);
            }

            numberString = String.valueOf(summary);
            persistence ++;
        }
        return persistence;
    }
}

// Description
// Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
// For example (Input --> Output):
// 39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
// 999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
// 4 --> 0 (because 4 is already a one-digit number)