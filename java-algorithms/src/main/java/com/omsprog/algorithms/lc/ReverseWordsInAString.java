package com.omsprog.algorithms.lc;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] words = s.replaceAll("\\s+", " ").trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);

            if(i != 0)
                sb.append(" ");
        }


        return sb.toString();
    }
}
