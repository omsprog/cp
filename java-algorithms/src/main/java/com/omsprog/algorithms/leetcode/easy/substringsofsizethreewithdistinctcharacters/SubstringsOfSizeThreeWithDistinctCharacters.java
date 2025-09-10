package com.omsprog.algorithms.leetcode.easy.substringsofsizethreewithdistinctcharacters;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        int left = 0, right = 0, counter = 0;
        int[] freqs = new int[26];

        while(right < s.length()) {
            char cR = s.charAt(right);
            freqs[cR - 'a'] = freqs[cR - 'a'] + 1;

            if(right - left + 1 == 3) {
                boolean hasDuplicates = false;
                for(int i = 0; i < 26; i++) {
                    if(freqs[i] > 1) {
                        hasDuplicates = true;
                        break;
                    }
                }
                if(!hasDuplicates) ++counter;
                char cL = s.charAt(left);
                freqs[cL - 'a'] = freqs[cL - 'a'] - 1;
                ++left;
            }
            ++right;
        }

        return counter;
    }
}
