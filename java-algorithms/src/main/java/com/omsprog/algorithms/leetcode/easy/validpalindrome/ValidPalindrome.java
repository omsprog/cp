package com.omsprog.algorithms.leetcode.easy.validpalindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            while(left < right) {
                if(Character.isLetterOrDigit(s.charAt(left)))
                    break;
                ++left;
            }

            while(left < right) {
                if(Character.isLetterOrDigit(s.charAt(right)))
                    break;
                --right;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            ++left;
            --right;
        }

        return true;
    }
}
