package com.example.kyu6;

public class MultiplicationTable {

//    Solution 1
    public static int[][] multiplicationTable(int n) {
        // Initialize the 2D array to hold the multiplication table
        int[][] table = new int[n][n];

        // Fill in the table
        for (int i = 0; i < n; i++) { // Iterate over rows
            for (int j = 0; j < n; j++) { // Iterate over columns
                // Set the value at [i][j] as the product of (i + 1) * (j + 1)
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        // Return the completed table
        return table;
    }
}

// Description
// Your task, is to create N×N multiplication table, of size provided in parameter.
// For example, when given size is 3:
// 1 2 3
// 2 4 6
// 3 6 9
// For the given example, the return value should be:
// [[1,2,3],[2,4,6],[3,6,9]]