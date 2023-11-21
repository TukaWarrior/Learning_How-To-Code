package com.example.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        // We have a list of names and want to check how many unique names are in this list. 
        // The complicated way of doing it would be to iterate over the list, store names in another list and check if that name is already in the second list before adding it. 
        // A better way would be to convert the list to a HashSet, because hashsets can only have unique values. 
        // But an even better way is to use Java Streams. 

        // Java Streams are an expressive ways to iterate over sequences of data and perform operations on that data. 
        // They are especially useful for Collections like Lists, Sets or Maps. 
        // They remove the need for looping like "for" or "while". 
        // They are part of the java.util.stream package. They use the interface Stream<T>. 
        // Streams alway create a copy of the inpuztted data. They never manipulate it directly. 

        // Creating an ArrayLiust of 10 names. 
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Paul");
        nameList.add("Helene");
        nameList.add("Sigfrield");
        nameList.add("Paula");
        nameList.add("Mario");
        nameList.add("Luigi");
        nameList.add("Maya");
        nameList.add("Helene");
        nameList.add("John");
        nameList.add("Mario");

        // Java Stream to count the unisque names in the list.
        long numberOfNames = nameList.stream().distinct().count();
        System.out.println(numberOfNames);


        // Create Java Stream from Array:  
        String[] array1 = new String[]{"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array1);
        System.out.println(stream1.count());

        // Creating Java Stream from sequence of parameters: 
        Stream<String> stream2 = Stream.of("a", "b", "c");
        System.out.println(stream2.count());

        // Create Java Stream from Collection (List, Set, Map): 
        Stream<String> stream3 = nameList.stream();
        System.out.println(stream3.count());

        // Methods to create java Streams: 
        Stream.generate(() -> "String element").limit(20);  // Creates a stream that generates 10 String elements. Important to limit, otherwise it never stops generating objects. 
        Stream.iterate(0, i -> i < 10, i -> i+1);              // Creates a stream with the numbers 0 to 9. Similar to a for loop. 


        // Streams have three main components: 
        // Source: Streams are created from a source, such as a collection (List, Set, etc.), an array, an I/O channel, or a generator function.
        // Intermediate Operations: These are operations that transform a stream into another stream. Examples include filter, map, flatMap, distinct, and sorted.
        // Terminal Operations: These operations produce a result or a side-effect. Examples include forEach, reduce, collect, min, max, and count.


        // Intermediate Operations: 
        // filter (Predicate<T>, p)
        List<String> filteredList = nameList.stream()
        .filter(element -> element.contains("Mario"))
        .collect(Collectors.toList());
        System.out.println(filteredList);

        // map (Function<T,R> m) Can be used to create a new stream with a different data type e.g String to int.
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        List<String> numberStringList = numberList.stream()
        .map(Object::toString)
        .collect(Collectors.toList());
        System.out.println(numberStringList);

        // sorted (Comparator<T> c)
        List<String> sortedList = nameList.stream()
        .sorted((s1, s2) -> s1.compareTo(s2))
        .collect(Collectors.toList());
        System.out.println(sortedList);


        // Terminal Operations: 
        // collect (Collector<T,A,R> c)
        nameList.stream()
        .collect(Collectors.toList());

        // collect with group by
        // List<String> groupedList = nameList.stream()
        // .collect(Collectors.groupingBy(p -> p.getName));

        // forEach(Consumer<T> c)
        nameList.stream()
        .forEach(System.out::println);

        // reduce(T value, BinaryOperator<T> commect)
        // List<String> reduceList = nameList.stream()
        // .map(p -> p.getName()).reduce("", (s1, s2) -> s1 + ", " +s2));
        
        // count()
        nameList.stream()
        .count();

        // Finders (Returns one element from stream)
        // findAny()                            .findAny().get()
        // findFirst()                          .findFirst().get()
        // max(Comparator<T> c)                 .max((s1, s2) -> s1.compareTo(s2)).get()
        // min(Comparator<T> c)                 .min((s1, s2) -> s1.compareTo(s2)).get()

        // Matchers (Return boolean)
        // allMatch(Predicate<T> p)             .allMatch(p -> p.getAlter() > 20))
        // anyMatch(Predicate<T> p)             .anyMatch(p -> p.getAlter() > 20))    
        // noneMatch(Predicate<T> p)            .noneMatch(p -> p.getAlter() > 20))

        // Modifiers
        // distinct()                           .distinct()
        // limit(int maxSize)                   .limit(3)
        // skip(long n)                         .skip(5)
    }
}