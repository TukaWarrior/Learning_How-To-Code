package com.example.Enum;

public class Main {
    public static void main(String[] args) {

       Difficulty difficulty = Difficulty.EASY;
       System.out.println(difficulty);

        // The benefit of enums are that they are defined before compilation / runtime. 
        // Meaning it can be checked, if a certain variable (like difficulty) has a value that can actually exist (EASY, MEDIUM, HARD can exist. PEACEFUl can not.)


        // Enums implement own methods.
        for (Difficulty diff : Difficulty.values()) {
            System.out.println(diff + " " + diff.name() + " " + diff.ordinal());
        }

        
        Difficulty2 difficulty2 = Difficulty2.MEDIUM;
        String diff2 = difficulty2.getDifficulty2();
        System.out.println(diff2);
    }
}