package com.omsprog.algorithms.leetcode.easy.maximumcountofpositiveintegerandnegativeinteger;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    private int getNumberOfNegativeValues(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

    private int getNumberOfPositiveValues(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] <= 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return nums.length - left;
    }


    public int maximumCount(int[] nums) {
        int numberOfNegativeValues = getNumberOfNegativeValues(nums);
        int numberOfPositiveValues = getNumberOfPositiveValues(nums);
        return Math.max(numberOfNegativeValues, numberOfPositiveValues);
    }
}
