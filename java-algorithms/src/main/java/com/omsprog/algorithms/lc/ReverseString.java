package com.omsprog.algorithms.lc;

public class ReverseString {
    public void reverseString(char[] s) {
        int pointerA = 0;
        int pointerB = s.length - 1;

        while(pointerA < pointerB) {
            char tmp = s[pointerA];
            s[pointerA] = s[pointerB];
            s[pointerB] = tmp;

            // advance pointers
            pointerA++;
            pointerB--;
        }
    }
}
