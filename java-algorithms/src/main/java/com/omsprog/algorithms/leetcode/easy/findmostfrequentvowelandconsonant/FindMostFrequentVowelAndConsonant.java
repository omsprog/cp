package com.omsprog.algorithms.leetcode.easy.findmostfrequentvowelandconsonant;

import java.util.HashSet;
import java.util.Set;

public class FindMostFrequentVowelAndConsonant {
    public int maxFreqSum(String s) {
        int[] vowelsF = new int[26];
        int[] consonantsF = new int[26];
        char[] sToArray = s.toCharArray();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for(char c: sToArray) {
            int targetIndex = c - 'a';
            if(vowels.contains(c))
                vowelsF[targetIndex] = vowelsF[targetIndex] + 1;
            else
                consonantsF[targetIndex] = consonantsF[targetIndex] + 1;
        }

        int mostFrequentVowel = 0;
        int mostFrequentConsonant = 0;

        for(int i = 0; i < 26; i++) {
            mostFrequentVowel = Math.max(mostFrequentVowel, vowelsF[i]);
            mostFrequentConsonant = Math.max(mostFrequentConsonant, consonantsF[i]);
        }
        return mostFrequentVowel + mostFrequentConsonant;
    }
}
