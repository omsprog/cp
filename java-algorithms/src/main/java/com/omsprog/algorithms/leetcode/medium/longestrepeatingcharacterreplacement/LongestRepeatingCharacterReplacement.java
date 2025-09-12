package com.omsprog.algorithms.leetcode.medium.longestrepeatingcharacterreplacement;

public class LongestRepeatingCharacterReplacement {
    private boolean isValidWindow(int[] memory, int k) {
        int biggest = memory[0];
        int total = 0;
        for(int i = 0; i < 26; i++) {
            biggest = Math.max(biggest, memory[i]);
            total += memory[i];
        }

        return total - biggest <= k;
    }

    public int characterReplacement(String s, int k) {
        int left = 0, right = 0;
        char[] sToArray = s.toCharArray();
        int longest = 0;
        int[] memory = new int[26];
        while(right < sToArray.length) {
            char cR = sToArray[right];
            memory[cR - 'A'] = memory[cR - 'A'] + 1;
            while(!isValidWindow(memory, k)) {
                char cL = sToArray[left];
                memory[cL - 'A'] = memory[cL - 'A'] - 1;
                ++left;
            }
            int length = right - left + 1;
            longest = Math.max(length, longest);
            ++right;
        }
        return longest;
    }
}
