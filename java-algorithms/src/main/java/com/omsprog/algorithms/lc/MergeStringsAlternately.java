package com.omsprog.algorithms.lc;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        boolean processRemaining = word1.length() != word2.length();
        int minimumLength = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < minimumLength; i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if(processRemaining) {
            String largerString = word1.length() > word2.length() ? word1 : word2;
            sb.append(largerString.substring(minimumLength));
        }

        return sb.toString();
    }
}
