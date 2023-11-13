package com.example.kyu7;

public class LeapYears {

    // Solution 1 - If statement
    public static boolean isLeapYear(int year) {
        if (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Solution 2 - Return true when
    // public static boolean isLeapYear(int year) {
    //     return (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0));
    // }
}