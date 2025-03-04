package com.omsprog.algorithms.lc;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String xS = new String("" + x);
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
