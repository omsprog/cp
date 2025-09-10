package com.omsprog.algorithms.leetcode.medium.permutationinstring;

public class PermutationInString {
    private boolean isAnagram(int[] freqS, int[] freqP) {
        for(int j = 0; j < 26; j++) {
            if(freqP[j] != freqS[j]) return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        // calculate frequencies for s1
        int[] freqS1 = new int[26];
        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            freqS1[c - 'a'] = freqS1[c - 'a'] + 1;
        }

        int left = 0, right = 0;
        int[] freqS2 = new int[26];

        while(right < s2.length()) {
            char cR = s2.charAt(right);
            freqS2[cR - 'a'] = freqS2[cR - 'a'] + 1;
            if(right - left + 1 == s1.length()) {
                if(isAnagram(freqS1, freqS2)) return true;

                char cL = s2.charAt(left);
                freqS2[cL - 'a'] = freqS2[cL - 'a'] - 1;
                ++left;
            }
            ++right;
        }

        return false;
    }
}
