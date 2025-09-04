package com.omsprog.algorithms.leetcode.easy.findclosestperson;

public class FindClosestPerson {
    public int findClosest(int x, int y, int z) {
        int diff1 = Math.abs(z - x);
        int diff2 = Math.abs(z - y);

        if(diff1 == diff2) return 0;
        else return diff1 < diff2 ? 1 : 2;
    }
}
