package com.example.ExceptionsAssertions;

import java.io.FileInputStream;
import java.io.InputStream;

public class TryCatch {
    public static void main(String[] args) {
        try {

            InputStream in = new FileInputStream("missing.ser");
            System.out.println("File open");
            in.close();

        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }

    }
}