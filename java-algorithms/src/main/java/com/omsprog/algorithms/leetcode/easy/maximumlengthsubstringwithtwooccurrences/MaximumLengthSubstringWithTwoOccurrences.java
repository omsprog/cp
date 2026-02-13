package com.omsprog.algorithms.leetcode.easy.maximumlengthsubstringwithtwooccurrences;

public class MaximumLengthSubstringWithTwoOccurrences {
    public int maximumLengthSubstring(String s) {
        int[] frequencies = new int[32];
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int localLength = 0;

        while(right < s.length()) {
            int indexR = s.charAt(right) - 'a';
            frequencies[indexR] += 1;
            while(frequencies[indexR] > 2) {
                int indexL = s.charAt(left) - 'a';
                frequencies[indexL] -= 1;
                ++left;
            }
            localLength = right - left + 1;
            maxLength = Math.max(maxLength, localLength);
            ++right;
        }

        return maxLength;
    }
}
