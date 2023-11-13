package com.example.kyu7;

public class SmoothNumbers {
    public static String isSmooth(long n) {
        if ((n & (n - 1)) == 0 && (n > 1)) {
            return "power of 2";
        } else if (isSmoothWithFactor(n, 3)){
            return "3-smooth";
        } else {
            return "Hamming number";
        } else {
            return "humble number";
        } else {
            return "non-smooth";
        }
        

        private static boolean isSmoothWithFactor(long num, int factor) {
            while (num % factor == 0) {
                num /= factor;
            }
            return num == 1;
        }
    }



        // return "power of 2";

        // return "3-smooth";
// 
        // return "Hamming number";

        // return "humble number";

        // return "non-smooth";
    }    
}
