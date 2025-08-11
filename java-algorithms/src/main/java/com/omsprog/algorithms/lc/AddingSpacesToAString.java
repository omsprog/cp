package com.omsprog.algorithms.lc;

public class AddingSpacesToAString {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();

        int indexS = 0;

        for(int i = 0; i < s.length(); i++) {
            if(indexS < spaces.length && i == spaces[indexS]) {
                sb.append(" ");
                ++indexS;
            }
            char c = s.charAt(i);
            sb.append(c);
        }

        return sb.toString();
    }
}
