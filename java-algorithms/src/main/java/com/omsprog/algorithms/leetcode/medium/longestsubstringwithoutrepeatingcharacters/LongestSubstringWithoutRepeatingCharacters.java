package com.omsprog.algorithms.leetcode.medium.longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> memory = new HashSet<>();
        int left = 0, right = 0;
        int longest = 0;

        while(right < s.length()) {
            char cR = s.charAt(right);
            while(memory.contains(cR)) {
                char cL = s.charAt(left);
                memory.remove(cL);
                ++left;
            }
            memory.add(cR);
            int length = right - left + 1;
            longest = Math.max(longest, length);
            ++right;
        }

        return longest;
    }
}
