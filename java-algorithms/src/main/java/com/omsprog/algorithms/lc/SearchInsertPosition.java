package com.omsprog.algorithms.lc;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int pointerA = 0;
        int pointerB = nums.length - 1;

        while(pointerA <= pointerB) {
            int midpoint = (pointerA + pointerB)/2;

            if(nums[midpoint] == target)
                return midpoint;
            if(nums[midpoint] < target)
                pointerA = midpoint + 1;
            else
                pointerB = midpoint - 1;
        }

        return pointerA;
    }
}
