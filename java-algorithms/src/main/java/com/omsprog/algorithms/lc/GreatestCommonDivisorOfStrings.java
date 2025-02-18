package com.omsprog.algorithms.lc;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        // calculate gcd
        int a = str1.length() > str2.length() ? str1.length() : str2.length();
        int b = str1.length() > str2.length() ? str2.length() : str1.length();

        int r = a % b;

        while(r != 0) {
            a = b;
            b = r;
            r = a % b;
        }

        int gcd = b;

        // match strings
        int str1Iterations = str1.length() / gcd;
        int str2Iterations = str2.length() / gcd;

        String commonStr = str1.substring(0, gcd);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i = 0; i < str1Iterations; i++) {
            sb1.append(commonStr);
        }

        for(int i = 0; i < str2Iterations; i++) {
            sb2.append(commonStr);
        }

        if(str1.equals(sb1.toString()) && str2.equals(sb2.toString()))
            return commonStr;

        return "";
    }
}
