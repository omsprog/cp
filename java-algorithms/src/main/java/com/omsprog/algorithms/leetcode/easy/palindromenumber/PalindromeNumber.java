package com.omsprog.algorithms.leetcode.easy.palindromenumber;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String xS = "" + x;
        int l = 0;
        int r = xS.length() - 1;

        while(l < r) {
            if(xS.charAt(l) != xS.charAt(r)) return false;
            ++l;
            --r;
        }

        return true;
    }
}
