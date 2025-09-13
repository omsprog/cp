package com.omsprog.algorithms.leetcode.easy.firstuniquecharacterinastring;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char[] charArray = s.toCharArray();

        for(char c : charArray)
            freq[c - 'a'] = freq[c - 'a'] + 1;

        for(int i = 0; i < charArray.length; i++)
            if(freq[charArray[i] - 'a'] == 1) return i;

        return -1;
    }
}
