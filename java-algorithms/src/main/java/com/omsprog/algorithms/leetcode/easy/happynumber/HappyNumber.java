package com.omsprog.algorithms.leetcode.easy.happynumber;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    private int getNext(int n) {
        int res = 0;
        while(n > 0) {
            int digit = n % 10;
            res = res + digit * digit;
            n = n / 10;
        }
        return res;
    }

    public boolean isHappy(int n) {
        Set<Integer> memory = new HashSet<>();
        memory.add(n);
        while(n != 1) {
            n = getNext(n);
            if(memory.contains(n)) return false;
            memory.add(n);
        }

        return true;
    }
}
