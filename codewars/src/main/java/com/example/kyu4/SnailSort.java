package com.example.kyu4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SnailSort {

    // Solution 1

    public static int[] snail(int[][] array) {
        List<Integer> result = new ArrayList<>();

        while (array.length > 0) {
            // Move from left to right
            for (int i : array[0]) {
                result.add(i);
//                result.add(i);
            }
            array = rotateLeft(array);

            // Move from top to bottom
            for (int i = 0; i < array.length; i++) {
                result.add(array[i][array[i].length - 1]);
                array[i] = removeLastElement(array[i]);
            }

            // Move from right to left
            if (array.length > 0) {
                for (int i = array[array.length - 1].length - 1; i >= 0; i--) {
                    result.add(array[array.length - 1][i]);
                }
                array = removeLastRow(array);
            }

            // Move from bottom to top
            if (array.length > 0 && array[0].length > 0) {
                for (int i = array.length - 1; i >= 0; i--) {
                    result.add(array[i][0]);
                    array[i] = removeFirstElement(array[i]);
                }
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[][] rotateLeft(int[][] array) {
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][j] = array[array.length - 1 - j][i];
            }
        }
        return result;
    }

    private static int[] removeLastElement(int[] row) {
        return Arrays.copyOf(row, row.length - 1);
    }

    private static int[][] removeLastRow(int[][] array) {
        return Arrays.copyOfRange(array, 0, array.length - 1);
    }

    private static int[] removeFirstElement(int[] row) {
        return Arrays.copyOfRange(row, 1, row.length);
    }

    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result1 = snail(array1);
        System.out.println(Arrays.toString(result1));  // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]

        int[][] array2 = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        int[] result2 = snail(array2);
        System.out.println(Arrays.toString(result2));  // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}

// Description
//Snail Sort
//Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
//array = [[1,2,3],
//        [4,5,6],
//        [7,8,9]]
//snail(array) #=> [1,2,3,6,9,8,7,4,5]
//For better understanding, please follow the numbers of the next array consecutively:
//array = [[1,2,3],
//        [8,9,4],
//        [7,6,5]]
//snail(array) #=> [1,2,3,4,5,6,7,8,9]