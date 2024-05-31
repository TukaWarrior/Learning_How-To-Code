package com.example.Generics;

// Generic classes allow to store values of different types inide an variable. 
// If the variable attribute is set to e.g. String, we could only put Strings inside the variable attribute.
// If we don't know before runtime what type of data will be put inside this variable, we can define the class as generic. 
// It allows us to store different types of data inside the "attribute" variable like Strings, int, double, Objects etc. 
// The types T and U in this example are placeholders of the types that get defined at runtime. 
// A generic class can have multiple generic variables.

public class Animal2<T, U>{

    // Fields
    private T attribute1;
    private U attribute2;

    // Methods
    public void setGenericAttribute1(T attribute1){
        this.attribute1 = attribute1;
    }

    public T getGenericAttribute1(){
        return this.attribute1;
    }

    public void setGenericAttribute2(U attribute2){
        this.attribute2 = attribute2;
    }

    public U getGenericAttribute2(){
        return this.attribute2;
    }
}