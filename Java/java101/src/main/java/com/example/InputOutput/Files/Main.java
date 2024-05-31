package com.example.InputOutput.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) throws IOException { // NIO exception have to be catched somewhere.

        // Creating Files and Directories
        Path directory = Paths.get("C:/temp/java_exercise/files"); // Directorpy Path
        Path file = directory.resolve("test.txt"); // File Path
        if (!Files.exists(directory)) { // If file does
            Files.createDirectories(directory);
        }
        if (!Files.exists(file)) {
            Files.createFile(file);
        }

        // Copy and move
        Path backupDirectory = directory.resolve("backup");
        Path backupFile = backupDirectory.resolve("backup.txt");

        if (Files.notExists(backupDirectory)) {
            Files.createDirectories(backupDirectory);
        }
        Files.copy(file, backupFile, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
        Files.move(backupFile, backupDirectory.resolve("new.txt"));

        // Delete
        if (Files.exists(backupDirectory)) {
            Files.delete(backupDirectory);
        }
        Files.deleteIfExists(backupFile); // Does not throw an exception if file does not exist.

        // Files properties
        System.out.println("isReadable:         " + Files.isReadable(file));
        System.out.println("isWritable:         " + Files.isWritable(file));
        System.out.println("isExecutable:       " + Files.isExecutable(file));
        System.out.println("isHidden:           " + Files.isHidden(file));

    }
}