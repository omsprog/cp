package com.omsprog.algorithms.lc;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0];

        int numberOfStrs = strs.length;
        String testStr = strs[0];
        String longestPrefix = "";
        for(int i = 1; i <= testStr.length(); i++) {
            int numberOfMatches = 0;
            String auxStr = testStr.substring(0,i);
            for(String str : strs) {
                if(str.startsWith(auxStr))
                    ++numberOfMatches;
            }
            if(numberOfMatches == numberOfStrs) {
                longestPrefix = auxStr;
            } else {
                return longestPrefix;
            }
        }
        return longestPrefix;
    }
}