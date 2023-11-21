package com.example.Generics;

// Generic classes allow to store values of different types inide an variable. 
// If the variable attribute is set to e.g. String, we could only put Strings inside the variable attribute.
// If we don't know before runtime what type of data will be put inside this variable, we can define the class as generic. 
// It allows us to store different types of data inside the "attribute" variable like Strings, int, double, Objects etc. 
// The types T and U in this example are placeholders of the types that get defined at runtime. 
// A generic class can have multiple generic variables.

public class Animal<T>{

    // Fields
    private T attribute;

    // Methods
    public void setGenericAttribute(T attribute){
        this.attribute = attribute;
    }

    public T getGenericAttribute(){
        return this.attribute;
    }
}