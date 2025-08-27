package com.omsprog.algorithms.leetcode.easy.movezeroes.twopointersii;

public class MoveZeroesTwoPointersII {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length;  i++) {
            if(nums[i] != 0)
                nums[index++] = nums[i];
        }

        while(index < nums.length) {
            nums[index++] = 0;
        }
    }
}
