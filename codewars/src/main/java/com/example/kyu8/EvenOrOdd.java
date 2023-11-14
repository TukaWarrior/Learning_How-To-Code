package com.example.kyu8;

public class EvenOrOdd {

    // Solution 1 - If statement
    public static String evenOrOdd(int number) {
        
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}

// Description
// Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.