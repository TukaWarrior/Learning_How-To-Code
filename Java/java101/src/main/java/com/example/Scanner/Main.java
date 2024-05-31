package com.example.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter something: ");

        String userInput = scn.nextLine();
        System.out.println("You entered: " + userInput);
    }
}