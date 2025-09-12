package com.omsprog.algorithms.leetcode.medium.kradiussubarrayaverages;

public class KRadiusSubarrayAverages {
    public int[] getAverages(int[] nums, int k) {
        int windowLength = 2 * k + 1;
        int[] answer = new int[nums.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = -1;
        }
        if(nums.length < windowLength) return answer;

        int left = 0, right = 0;
        long sum = 0;

        while(right < answer.length) {
            sum += nums[right];
            if(right - left + 1 == windowLength) {
                int avg = (int)(sum / windowLength);
                answer[left + k] = avg;
                sum -= nums[left];
                ++left;
            }
            ++right;
        }

        return answer;
    }
}
