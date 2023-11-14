package com.example.kyu7;

public class StringEndsWith {
    // Solution 1 - String Ends With
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }
}

// Description
// Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
// Examples:
// solution('abc', 'bc') // returns true
// solution('abc', 'd') // returns false