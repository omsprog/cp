package com.omsprog.algorithms.leetcode.easy.validanagram;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        // calculate array of frequencies for s
        int[] freqS = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freqS[c - 'a'] = freqS[c - 'a'] + 1;
        }

        // calculate array of frequencies for t
        int[] freqT = new int[26];
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            freqT[c - 'a'] = freqT[c - 'a'] + 1;
        }

        // compare arrays of frequencies
        for(int i = 0; i < 26; i++)
            if(freqS[i] != freqT[i]) return false;
        return true;
    }
}
