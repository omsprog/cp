package com.omsprog.algorithms.lc;

public class StringCompression {
    public int compress(char[] chars) {
        int pointer = 0;
        char previousChar = chars[0];
        int ocurrences = 1;

        for(int i = 1; i < chars.length; i++) {
            char currentChar = chars[i];
            if(currentChar == previousChar)
                ocurrences++;
            else {
                chars[pointer] = previousChar;
                if(ocurrences > 1) {
                    String ocurrencesStr = "" + ocurrences;
                    for(int j = 0; j < ocurrencesStr.length(); j++) {
                        ++pointer;
                        chars[pointer] = ocurrencesStr.charAt(j);
                    }
                }

                ++pointer;
                ocurrences = 1;
            }

            previousChar = currentChar;
        }

        // process last
        chars[pointer] = previousChar;
        if(ocurrences > 1) {
            String ocurrencesStr = "" + ocurrences;
            for(int i = 0; i < ocurrencesStr.length(); i++) {
                ++pointer;
                chars[pointer] = ocurrencesStr.charAt(i);
            }
        }

        return pointer + 1;
    }
}
