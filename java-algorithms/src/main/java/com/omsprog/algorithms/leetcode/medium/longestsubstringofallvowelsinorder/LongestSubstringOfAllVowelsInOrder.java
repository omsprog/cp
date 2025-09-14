package com.omsprog.algorithms.leetcode.medium.longestsubstringofallvowelsinorder;

import java.util.Arrays;

public class LongestSubstringOfAllVowelsInOrder {
    private boolean isBeautifulString(int[] freqs) {
        int c = 0;
        for(int i = 0; i < 5; i++)
            if(freqs[i] > 0) ++c;
        return c == 5;
    }

    public int indexOfVowel(char c) {
        if(c == 'a')
            return 0;
        else if(c == 'e')
            return 1;
        else if(c == 'i')
            return 2;
        else if(c == 'o')
            return 3;
        else
            return 4;
    }

    public int longestBeautifulSubstring(String word) {
        int longest = 0;
        int left = 0, right = 0;
        int[] freqs = new int[5];

        while(right < word.length()) {
            char cR = word.charAt(right);
            freqs[indexOfVowel(cR)] += 1;
            if(right != 0 && cR - 'a' < word.charAt(right - 1) - 'a') {
                left = right;
                Arrays.fill(freqs, 0);
                freqs[indexOfVowel(cR)] = 1;
            }
            if(isBeautifulString(freqs))
                longest = Math.max(longest, right - left + 1);
            ++right;
        }

        return longest;
    }
}
