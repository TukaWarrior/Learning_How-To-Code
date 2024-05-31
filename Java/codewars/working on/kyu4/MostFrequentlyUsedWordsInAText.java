package com.example.kyu4;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MostFrequentlyUsedWordsInAText {
    public static List<String> top3(String s) {

        final Map<String, Integer> wordsCount = new HashMap<>();

        Pattern pattern = Pattern.compile("[A-Za-z][A-Za-z']*");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String str = matcher.group().toLowerCase();
            wordsCount.put(str, wordsCount.getOrDefault(str, 1) + 1);
        }

        List<Map.Entry<String, Integer>> topWords = new ArrayList<>(wordsCount.entrySet());
        topWords.sort(Map.Entry.comparingByValue());
        ArrayList<String> result = new ArrayList<>();
        int j = 0;
        for (int i = topWords.size() - 1; i >= 0; i--) {
            String str = topWords.get(i).getKey();
            if (j > 2 || str == null || str.length() == 0) {
                break;
            }
            if (Character.isAlphabetic(str.charAt(0))) {
                result.add(j, topWords.get(i).getKey());
                j++;
            }
        }

        result.trimToSize();
        return result;
    }

//        // Regular expression to match words according to the specified rules
//        final String regex = "(?i)[a-z']+(?<=\\w)'?(?=\\s|$)";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(s);
//
//        // Use a map to count the occurrences of each word
//        Map<String, Integer> wordCounts = new HashMap<>();
//        while (matcher.find()) {
//            // Convert to lowercase because matches should be case-insensitive
//            String word = matcher.group().toLowerCase();
//            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
//        }
//
//        // Sort the entries of the map by value (count) in descending order and get the keys (words)
//        List<String> topWords = wordCounts.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//
//        // Return the top 3 words, or fewer if there aren't that many
//        return topWords.subList(0, Math.min(topWords.size(), 3));
}

// Description
//    Write a function that, given a string of text (possibly with punctuation and line-breaks), returns an array of the top-3 most occurring words, in descending order of the number of occurrences.
//
//    Assumptions:
//    A word is a string of letters (A to Z) optionally containing one or more apostrophes (') in ASCII.
//    Apostrophes can appear at the start, middle or end of a word ('abc, abc', 'abc', ab'c are all valid)
//    Any other characters (e.g. #, \, / , . ...) are not part of a word and should be treated as whitespace.
//    Matches should be case-insensitive, and the words in the result should be lowercased.
//    Ties may be broken arbitrarily.
//    If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned, or an empty array if a text contains no words.
//
//    Examples:
//    "In a village of La Mancha, the name of which I have no desire to call to
//    mind, there lived not long since one of those gentlemen that keep a lance
//    in the lance-rack, an old buckler, a lean hack, and a greyhound for
//    coursing. An olla of rather more beef than mutton, a salad on most
//    nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
//    on Sundays, made away with three-quarters of his income."
//    --> ["a", "of", "on"]
//
//    "e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"
//    --> ["e", "ddd", "aa"]
//
//    "  //wont won't won't"
//    --> ["won't", "wont"]
//
//    Bonus points (not really, but just for fun):
//    Avoid creating an array whose memory footprint is roughly as big as the input text.
//    Avoid sorting the entire array of unique words.