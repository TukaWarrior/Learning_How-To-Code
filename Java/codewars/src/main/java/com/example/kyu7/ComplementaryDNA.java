package com.example.kyu7;

public class ComplementaryDNA {

    // Solution 1 - For loop and switch case
    public static String makeComplement(String dna) {
        String returnValue = "";

        for (int i = 0; i < dna.length(); i++) {
            char c = dna.charAt(i);

            switch (c) {
                case 'A':
                    returnValue += 'T';
                    break;
                case 'T':
                    returnValue +='A';
                    break;
                case 'C':
                    returnValue +='G';
                    break;
                case 'G':
                    returnValue +='C';
                    break;
            }
        }
        return returnValue;
    }
}

// Description
// Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.
// If you want to know more: http://en.wikipedia.org/wiki/DNA
// In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).
// More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

// Example: (input --> output)
// "ATTGC" --> "TAACG"
// "GTAT" --> "CATA"