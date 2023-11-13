package com.example.kyu6;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {

    // Solution 1 - Count Integers in a Hash Map
    public static int findIt(int[] a) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : a) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return 0;
    }

    // Solution 2 - Use Bitwise Operator XOR
    // public static int findIt(int[] a) {
    //     int result = 0;
    //     for (int num : a) {
    //         result ^= num;
    //     }
    //     return result;
    // }
}

// Description
// Given an array of integers, find the one that appears an odd number of times.
// There will always be only one integer that appears an odd number of times.

// Examples
// [7] should return 7, because it occurs 1 time (which is odd).
// [0] should return 0, because it occurs 1 time (which is odd).
// [1,1,2] should return 2, because it occurs 1 time (which is odd).
// [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
// [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).