package com.example.kyu7;

public class GreatestCommonDivisorBitcount {

    // Solution 1 - GDC and bitwise operator 
    public static int gcdBinary(int x, int y) {
        int gdcInteger = getGDC(x, y);
        return gdcCountBinaryOnes(gdcInteger);
    }
    
    public static int getGDC(int x, int y) {
        int num1 = Math.abs(x);
        int num2 = Math.abs(y);
        
        while (num2 != 0) {
            int temp = num2;
            num2 = (num1 % num2);
            num1 = temp;
        }
        return num1;
    }

    public static int gdcCountBinaryOnes(int gdcInteger) {
        int oneCounter = 0;
        while (gdcInteger != 0) {
            oneCounter += gdcInteger & 1;
            gdcInteger >>>= 1;
        } 
        return oneCounter;
    }
}

// Description
// The objective is to write a method that takes two integer parameters and returns a single integer equal to the number of 1s in the binary representation of the greatest common divisor of the parameters.
// Taken from Wikipedia: "In mathematics, the greatest common divisor (gcd) of two or more integers, when at least one of them is not zero, is the largest positive integer that divides the numbers without a remainder. For example, the GCD of 8 and 12 is 4."
// For example: the greatest common divisor of 300 and 45 is 15. The binary representation of 15 is 1111, so the correct output would be 4.
// If both parameters are 0, the method should return 0. The function must be able to handle negative input.