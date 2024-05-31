package com.example.Enum;

    // Enums can have Fields, Constructors and Methods.

public enum Difficulty2 {

    EASY(":)"),
    MEDIUM(":/"),
    HARD(":(");

    // Fields
    private String difficulty2;

    // Constructors
    private Difficulty2(String difficulty2) {
        this.difficulty2 = difficulty2;
    }

    // Methods
    public String getDifficulty2() {
        return this.difficulty2;
    }
}