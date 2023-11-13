package com.example.kyu7;

public class GreatestCommonDivisorBitcount {

    // Solution 1 - Euclid's Algorithm and String toBinary conversion. 
    public static int gcdBinary(int x, int y) {
        int gdcInteger = gdcCalculator(x, y);
        System.out.println(gdcInteger);
        return gdcCountBinaryOnes(gdcInteger);
    }
    
    public static int gdcCalculator(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcdBinary(y, x % y);
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