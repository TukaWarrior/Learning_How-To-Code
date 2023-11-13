package com.example.kyu8;

public class AgeRangeCompatibilityEquation {

    // Solution 1 - If statement
    public static String datingRange(int age) {

        double minAge, maxAge;

        if (age <= 14) {
            minAge = (age - (age * 0.1));
            maxAge = ((age * 0.1) + age);
        } else {
            minAge = ((age / 2) + 7);
            maxAge = ((age - 7) * 2);
        }
        return (int)minAge + "-" + (int)maxAge;
    }
}