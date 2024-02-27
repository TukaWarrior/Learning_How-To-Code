package com.example.InputOutput.ReadWrite;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) throws IOException {


        // Read file
        BufferedReader br = new BufferedReader(new FileReader(new File("C:/temp/java/text.txt")));

        String line = "";
        while (line != null) {
            line = br.readLine();
            System.out.println(line);
        }
        br.close();

        // Read file 2
        Path p = Paths.get("C:/temp/java/text.txt");
        BufferedReader bw2 = Files.newBufferedReader(p, Charset.forName("UTF-8"));


        // Write files
        String fileContent = "Hello World.";
        Path p2 = Paths.get("C:/temp/java/OutputFile.txt");
        BufferedWriter bw = Files.newBufferedWriter(p, Charset.forName("UTF-8"), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        bw.write(fileContent);
        bw.close();
    }
}