package com.omsprog.algorithms;

// Could you solve it without converting the integer to a string?

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        int xStringHalfLength = xString.length()/2;
        for(int i = 0; i < xStringHalfLength; i++) {
            if(xString.charAt(i) != xString.charAt(xString.length() - i - 1)) return false;
        }
        return true;
    }
}
