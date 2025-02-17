package com.omsprog.algorithms.lc;

public class RemoveStars {
    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if(currentChar == '*') {
                sb.setLength(sb.length() - 1);
            } else {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}
