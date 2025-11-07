package com.omsprog.algorithms.leetcode.easy.defusethebomb;

import java.util.Arrays;

public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        if(k == 0) {
            Arrays.fill(code, 0);
            return code;
        }

        int windowSum = 0;
        boolean negativeK = k < 0;
        k = Math.abs(k);
        for(int i = 0; i < k; i++) {
            windowSum += code[i];
        }
        int left = 0, right = k - 1;
        int index = 0;
        int lastIndex = code.length - 1;
        if(negativeK) index = k;
        else index = lastIndex;

        int[] answer = new int[code.length];

        for(int i = 0; i < code.length; i++) {
            answer[index] = windowSum;
            windowSum -= code[left];
            left = (left + 1) % code.length;
            right = (right + 1) % code.length;
            windowSum += code[right];
            index = (index + 1) % code.length;
        }
        return answer;
    }
}
