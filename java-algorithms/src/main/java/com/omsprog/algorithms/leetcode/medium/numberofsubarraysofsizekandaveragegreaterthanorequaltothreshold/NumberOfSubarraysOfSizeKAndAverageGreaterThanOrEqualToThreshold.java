package com.omsprog.algorithms.leetcode.medium.numberofsubarraysofsizekandaveragegreaterthanorequaltothreshold;

public class NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int result = 0;

        while(right < arr.length) {
            sum += arr[right];

            if(right - left + 1 == k) {
                if(sum / k >= threshold) ++result;
                sum -= arr[left];
                ++left;
            }

            ++right;
        }

        return result;
    }
}
