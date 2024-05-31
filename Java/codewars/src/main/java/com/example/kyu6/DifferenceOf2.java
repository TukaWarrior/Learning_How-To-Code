package com.example.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;


public class DifferenceOf2 {

    public static int[][] twosDifference(int[] array) {

        // Sort the array to make finding pairs easier
        Arrays.sort(array);
        // Use a list to store pairs
        List<int[]> pairs = new ArrayList<>();
        // Convert array to a set for faster lookups
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }
        // Iterate through the array and check if each element's counterpart (element + 2) exists
        for (int num : array) {
            if (set.contains(num + 2)) {
                pairs.add(new int[]{num, num + 2});
            }
        }
        // Convert the list of pairs to a 2D array
        int[][] result = new int[pairs.size()][2];
        for (int i = 0; i < pairs.size(); i++) {
            result[i] = pairs.get(i);
        }
        return result;
    }
}

//Difference of 2
// Description
// The objective is to return all pairs of integers from a given array of integers that have a difference of 2.
//The result array should be sorted in ascending order of values.
//Assume there are no duplicate integers in the array. The order of the integers in the input array should not matter.
//
//Examples
//[1, 2, 3, 4]  should return [[1, 3], [2, 4]]
//[4, 1, 2, 3]  should also return [[1, 3], [2, 4]]
//[1, 23, 3, 4, 7] should return [[1, 3]]
//[4, 3, 1, 5, 6] should return [[1, 3], [3, 5], [4, 6]]