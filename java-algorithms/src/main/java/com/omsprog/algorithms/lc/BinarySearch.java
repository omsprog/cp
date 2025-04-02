package com.omsprog.algorithms.lc;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int pointerA = 0;
        int pointerB = nums.length - 1;
        int midPoint = 0;

        while(pointerA <= pointerB) {
            midPoint = (pointerA + pointerB) / 2;
            int val = nums[midPoint];

            if(val == target) return midPoint;
            else if(val > target)
                pointerB = midPoint - 1;
            else
                pointerA = midPoint + 1;
        }

        return -1;
    }
}
