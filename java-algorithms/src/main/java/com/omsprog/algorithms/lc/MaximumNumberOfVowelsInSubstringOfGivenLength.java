package com.omsprog.algorithms.lc;

import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfVowelsInSubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        int count = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        for(int i = 0; i < k; i++)
            if(vowels.contains(s.charAt(i)))
                ++count;

        int max = count;

        int pointerA = 0;
        int pointerB = k - 1; //  abyiind   k = 6, pointer = 5

        while(pointerB < s.length() - 1) {
            ++pointerA;
            ++pointerB;
            if(vowels.contains(s.charAt(pointerA - 1)))
                --count;
            if(vowels.contains(s.charAt(pointerB)))
                ++count;
            max = Math.max(max, count);
        }

        return max;
    }
}
