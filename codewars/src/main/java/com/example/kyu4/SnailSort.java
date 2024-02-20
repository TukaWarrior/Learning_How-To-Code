package com.example.kyu4;

public class SnailSort {

    // Solution 1
    public static int[] snail(int[][] array) {

        if(array[0].length <= 0) {
            return new int[0];
        }

        int wall = -1;
        int n = array.length;
        int[] result = new int[n * n];
        int x = 0;
        int y = 0;
        int xStep = 1;
        int yStep = 0;

        for(int i = 0; i < result.length; ++i) {
            result[i] = array[y][x];
            array[y][x] = wall;

            x += xStep; y += yStep;

            if(xStep != 0 && (x < 0 || x >= n || array[y][x] == wall)) {
                x += -xStep; y += xStep;
                yStep = xStep; xStep = 0;
            }
            else if(yStep != 0 && (y < 0 || y >= n || array[y][x] == wall)) {
                x += -yStep; y += -yStep;
                xStep = -yStep; yStep = 0;
            }
        }
        return result;
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