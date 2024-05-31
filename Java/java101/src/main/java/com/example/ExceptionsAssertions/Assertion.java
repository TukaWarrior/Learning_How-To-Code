package com.example.ExceptionsAssertions;

public class Assertion {
    public static void main(String[] args) {

        int x = 1;
        assert x > 0; // No error because it is true.
        assert x == 0 : "x is not 0"; // Throws an AssertionError with the message "x is not 0", because the condition is wrong.
    }
}