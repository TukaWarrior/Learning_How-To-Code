package com.example.InputOutput.IOStreams;

import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person("Luke", 26, 178);

        serializeObject(p);
        deserializeObject();
    }

    // Serialize an object
    public static void serializeObject(Person p) throws IOException{
        FileOutputStream fileOut = new FileOutputStream("C:/temp/person.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(p);
        out.close();
    }

    // Deserialize an object
    public static Person deserializeObject() throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("C:/temp/java/person.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Person p2 = (Person) in.readObject();
        in.close();
        return p2;
    }

}