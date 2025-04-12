package com.omsprog.algorithms.lc;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k == 0) return;

        int numsC[] = new int[nums.length];

        int i = 0;
        for(; i < nums.length - k; i++) {
            numsC[k + i] = nums[i];
        }

        int aux = 0;
        for(; i < nums.length; i++) {
            numsC[aux] = nums[i];
            ++aux;
        }

        // Copy back to original array
        for (i = 0; i < nums.length; i++) {
            nums[i] = numsC[i];
        }
    }
}
