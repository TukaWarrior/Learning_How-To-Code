package com.example.ExceptionsAssertions;

import java.io.FileInputStream;
import java.io.InputStream;

public class Throws {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("missing.ser");
        System.out.println("File open");
        in.close();
    }
}