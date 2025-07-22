package com.omsprog.algorithms.lc;

public class DeleteCharactersToMakeFancyString {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int repeatCounter = 0;
        char lastChar = 0;

        for(char c : s.toCharArray()) {
            if(c == lastChar) {
                if(repeatCounter >= 2)
                    continue;
                else
                    ++repeatCounter;
            } else
                repeatCounter = 1;

            sb.append(c);

            lastChar = c;
        }

        return sb.toString();
    }
}
