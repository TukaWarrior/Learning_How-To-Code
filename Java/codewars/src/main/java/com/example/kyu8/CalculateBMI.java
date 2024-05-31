package com.example.kyu8;

public class CalculateBMI {

    // Solution 1 - If statement
    public static String bmi(double weight, double height) {
        double bmi = (weight / (height*height));
        String result = "";

        if (bmi > 30.0){
            result = "Obese";
        }
        if  (bmi <= 30.0) {
            result = "Overweight";
        } 
        if  (bmi <= 25.0 ){
            result = "Normal";
        } 
        if (bmi <= 18.5){
            result = "Underweight";
        }
        return result;
    }
}

// Description
// Write function bmi that calculates body mass index (bmi = weight / height2).
// if bmi <= 18.5 return "Underweight"
// if bmi <= 25.0 return "Normal"
// if bmi <= 30.0 return "Overweight"
// if bmi > 30 return "Obese"