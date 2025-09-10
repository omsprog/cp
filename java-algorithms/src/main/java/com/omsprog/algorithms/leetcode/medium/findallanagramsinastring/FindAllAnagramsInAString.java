package com.omsprog.algorithms.leetcode.medium.findallanagramsinastring;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAString {
    private boolean isAnagram(int[] freqS, int[] freqP) {
        for(int j = 0; j < 26; j++) {
            if(freqP[j] != freqS[j]) return false;
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {
        int left = 0, right = 0;
        List<Integer> result = new ArrayList<>();

        int[] freqP = new int[26];
        // calculate frequencies in p
        for(int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            freqP[c - 'a'] = freqP[c - 'a'] + 1;
        }

        int[] freqS = new int[26];
        while(right < s.length()) {
            char cR = s.charAt(right);
            freqS[cR - 'a'] = freqS[cR - 'a'] + 1;

            if(right - left + 1 == p.length()) {
                if(isAnagram(freqS, freqP))
                    result.add(left);

                char cL = s.charAt(left);
                freqS[cL - 'a'] = freqS[cL - 'a'] - 1;
                ++left;
            }

            ++right;
        }

        return result;
    }
}
