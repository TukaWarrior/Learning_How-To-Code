package com.example.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        // https://regex-generator.olafneumann.org/
        // A regular expression is a sequence of characters that forms a search pattern.
        // When you search for data in a text, you can use this search pattern to describe what you are searching for.
        // Regular expressions can be used to perform all types of text search and text replace operations.

        // Regex uses these classes:
        Pattern pattern = Pattern.compile("d"); // Defines the Pattern that is searched for.
        Matcher matcher = pattern.matcher("Dog"); // The Matcher method is used to search for a pattern in a String. The matcher object contains information about the search that was performed.

        System.out.println(matcher.find()); // Returns boolean

        String str1 = "Dog";
        System.out.println("Hello world!");

        // Regular Expression Patterns

        // Character Classes
        Pattern pattern11 = Pattern.compile("[abc]"); // Matches a, b or c.
        Pattern pattern12 = Pattern.compile("[^abc]"); // Negation, matches everything except a, b or c.
        Pattern pattern13 = Pattern.compile("[a-c]"); // Range, matches a, b or c.
        Pattern pattern14 = Pattern.compile("[a-c[g-i]]"); // Union, matches a, b, c, g, h, i.
        Pattern pattern15 = Pattern.compile("[a-c&&[b-c]]"); // Intersection, matches b or c.
        Pattern pattern16 = Pattern.compile("[a-c&&[^b-c]]"); // Subtraction, matches a.

        // Logical Operators
        Pattern pattern101 = Pattern.compile("[abc]"); // Matches a, b or c.
        Pattern pattern102 = Pattern.compile("[abc]|[def]"); // Matches a, b, c or d, e, f

        // Quantifiers
        Pattern p111 = Pattern.compile("[abc]*"); // 0 or more.
        Pattern p112 = Pattern.compile("[abc]*?"); // 0 or more, ungreedy.
        Pattern p113 = Pattern.compile("[abc]+"); // 1 or more.
        Pattern p114 = Pattern.compile("[abc]+?"); // 1 or more, ungreedy.
        Pattern p115 = Pattern.compile("[abc]?"); // 0 or 1.
        Pattern p116 = Pattern.compile("[abc]??"); // 0 or 1, ungreedy.
        Pattern p117 = Pattern.compile("[abc]{3}"); // Exactly 3
        Pattern p118 = Pattern.compile("[abc]{3,5}"); // 3, 4 or 5.
        Pattern p119 = Pattern.compile("[abc]{3,5}?"); // 3, 4 or 5, ungreedy.

        // Predefined Character Classes
        Pattern pattern21 = Pattern.compile("."); // Any character, except new line \n
        Pattern pattern22 = Pattern.compile("\\d"); // A digit: [0-9]
        Pattern pattern23 = Pattern.compile("\\D"); // A non digit: [^0-9]
        Pattern pattern24 = Pattern.compile("\\s"); // A whitespace character: [ \\t\\nx0B\\fr]
        Pattern pattern25 = Pattern.compile("\\S"); // A non whitespace character: [^\\s]
        Pattern pattern26 = Pattern.compile("\\w"); // A word character: [a-zA-Z_0-9]
        Pattern pattern27 = Pattern.compile("\\W"); // A non word character: [^\\w]

        // Boundary Matches
        Pattern pattern31 = Pattern.compile("^"); // The beginning of a line.
        Pattern pattern32 = Pattern.compile("$"); // The end of a line.
        Pattern pattern33 = Pattern.compile("\\b"); // A word boundary.
        Pattern pattern34 = Pattern.compile("\\B"); // A non word boundary.
        Pattern pattern35 = Pattern.compile("\\A"); // The beginning of the input.
        Pattern pattern36 = Pattern.compile("\\G"); // The end of the previous match.
        Pattern pattern37 = Pattern.compile("\\Z"); // The end of the input but for the final terminator, if any.
        Pattern pattern38 = Pattern.compile("\\z"); // The end of the input.

        // Pattern Flags
        Pattern pattern41 = Pattern.compile("[abc]", Pattern.CASE_INSENSITIVE); // Enables case-insensitive matching.
        Pattern pattern42 = Pattern.compile("[abc]", Pattern.COMMENTS); // Whitespaces and comments starting with # are ignored until the end of a line.
        Pattern pattern43 = Pattern.compile("[abc]", Pattern.MULTILINE); // One expression can match multiple lines.
        Pattern pattern44 = Pattern.compile("[abc]", Pattern.UNIX_LINES); // Only the \n line terminator is recognized in the behavior of .,^ and $.
        Pattern pattern45 = Pattern.compile("\\z"); // The end of the input.

//        Matcher matcher2 = pattern11.matcher("Aa dog");
//        System.out.println(matcher2.find());
    }
}