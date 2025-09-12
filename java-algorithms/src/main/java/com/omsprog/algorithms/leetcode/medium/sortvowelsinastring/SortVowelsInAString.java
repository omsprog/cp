package com.omsprog.algorithms.leetcode.medium.sortvowelsinastring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SortVowelsInAString {
    public String sortVowels(String s) {
        char[] sToChar = s.toCharArray();
        List<Character> vowelsInS = new ArrayList<>();
        Set<Character> vowels = Set.of('A','E','I','O','U','a','e','i','o','u');

        for(char c : sToChar) {
            if(vowels.contains(c))
                vowelsInS.add(c);
        }

        Collections.sort(vowelsInS);
        int index = 0;
        for(int i = 0; i < sToChar.length; i++) {
            char currentC = sToChar[i];
            if(vowels.contains(currentC))
                sToChar[i] = vowelsInS.get(index++);
        }

        return new String(sToChar);
    }
}
