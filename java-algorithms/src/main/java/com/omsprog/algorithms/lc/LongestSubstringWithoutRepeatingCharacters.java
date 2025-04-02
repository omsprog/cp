package com.omsprog.algorithms.lc;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();

        int a = 0;
        int b = 0;
        int longest = 0;

        for(char c : s.toCharArray()) {
            if(chars.contains(c))
                while(chars.contains(c)) {
                    char cAux = s.charAt(a);
                    chars.remove(cAux);
                    ++a; // moving pointer A
                }

            chars.add(c);
            ++b; // moving pointer B

            int delta = b - a;
            longest = Math.max(longest, delta);
        }

        return longest;
    }
}
