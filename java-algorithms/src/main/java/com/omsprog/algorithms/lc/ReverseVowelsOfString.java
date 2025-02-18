package com.omsprog.algorithms.lc;

import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {
    public String reverseVowels(String s) {
        int pointerA = 0;
        int pointerB = s.length() - 1;
        char[] chars = s.toCharArray();
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        boolean searchingA = true;

        while(pointerA < pointerB) {
            if(searchingA) {
                if(vowels.contains(s.charAt(pointerA))) {
                    searchingA = false;
                } else {
                    pointerA++;
                }
            }

            if(!searchingA) {
                if(vowels.contains(s.charAt(pointerB))) {
                    searchingA = true;
                    char tmp = chars[pointerA];
                    chars[pointerA] = chars[pointerB];
                    chars[pointerB] = tmp;

                    pointerA++;
                    pointerB--;
                } else {
                    pointerB--;
                }
            }
        }

        return new String(chars);
    }
}
