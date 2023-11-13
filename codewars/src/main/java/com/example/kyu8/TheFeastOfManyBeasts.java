package com.example.kyu8;

public class TheFeastOfManyBeasts {

    // Solution 1 - If statement using charAt index
    public static boolean feast(String beast, String dish) {

        if ((beast.charAt(beast.length()-1) == (dish.charAt(dish.length()-1))) && (beast.charAt(0)) == (dish.charAt(0))) {
            return true;
        }
        return false;
    }
}