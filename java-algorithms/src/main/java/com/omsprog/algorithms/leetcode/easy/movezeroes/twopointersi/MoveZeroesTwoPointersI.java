package com.omsprog.algorithms.leetcode.easy.movezeroes.twopointersi;

public class MoveZeroesTwoPointersI {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for(int zeroIndex = 0; zeroIndex < nums.length; zeroIndex++) {
            if(nums[zeroIndex] == 0) {
                if(nonZeroIndex <= zeroIndex)
                    nonZeroIndex = zeroIndex + 1;
                while(nonZeroIndex < nums.length && nums[nonZeroIndex] == 0)
                    ++nonZeroIndex;
                if(nonZeroIndex >= nums.length) return;
                int tmp = nums[zeroIndex];
                nums[zeroIndex] = nums[nonZeroIndex];
                nums[nonZeroIndex] = tmp;
            }
        }
    }
}
