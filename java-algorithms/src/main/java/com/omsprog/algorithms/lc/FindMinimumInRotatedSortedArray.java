package com.omsprog.algorithms.lc;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int a = 0;
        int b = nums.length - 1;

        while(nums[a] > nums[b]) {
            int mid = (a + b) / 2;
            if(nums[mid] > nums[b])
                a = mid + 1;
            else b = mid;
        }

        return nums[a];
    }
}
