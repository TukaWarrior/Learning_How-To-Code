package com.example.kyu6;

public class ValidateCreditCardNumber {

    // Solution 1 - String to Int Array
    public static boolean Validate(String n) {

        int sum = 0;
        int[] nArr = new int[n.length()];


        for (int i = 0; i < n.length(); i++) {
            nArr[i] = Character.getNumericValue(n.charAt(i));
        }

        if (nArr.length % 2 == 0) {
            for (int i = 0; i < nArr.length; i += 2) {
                nArr[i] *= 2;
                if (nArr[i] > 9) {
                    nArr[i] -= 9;
                }
            }
        } else {
            for (int i = 1; i < nArr.length; i += 2) {
                nArr[i] *= 2;
                if (nArr[i] > 9) {
                    nArr[i] -= 9;
                }
            }
        }

        for (int digit : nArr) {
            sum += digit;
        }

        return sum % 10 == 0;
    }
}

// Description
// Here is the algorithm:
// Double every other digit, scanning from right to left, starting from the second digit (from the right).
// Another way to think about it is: if there are an even number of digits, double every other digit starting with the first;
// if there are an odd number of digits, double every other digit starting with the second:
// 1714 ==> [1*, 7, 1*, 4] ==> [2, 7, 2, 4]
// 12345 ==> [1, 2*, 3, 4*, 5] ==> [1, 4, 3, 8, 5]
// 891 ==> [8, 9*, 1] ==> [8, 18, 1]

// If a resulting number is greater than 9, replace it with the sum of its own digits (which is the same as subtracting 9 from it):
// [8, 18*, 1] ==> [8, (1+8), 1] ==> [8, 9, 1]
// or:
// [8, 18*, 1] ==> [8, (18-9), 1] ==> [8, 9, 1]

// Sum all of the final digits:
// [8, 9, 1] ==> 8 + 9 + 1 = 18

// Finally, take that sum and divide it by 10. If the remainder equals zero, the original credit card number is valid.
// 18 (modulus) 10 ==> 8 , which is not equal to 0, so this is not a valid credit card number