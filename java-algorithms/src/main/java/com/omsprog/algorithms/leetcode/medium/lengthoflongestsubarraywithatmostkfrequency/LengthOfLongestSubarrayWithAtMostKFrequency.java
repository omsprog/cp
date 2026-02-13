package com.omsprog.algorithms.leetcode.medium.lengthoflongestsubarraywithatmostkfrequency;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubarrayWithAtMostKFrequency {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        int left = 0, right = 0, longest = 0;

        while(right < nums.length) {
            int numRight = nums[right];
            if(frequencies.containsKey(numRight)) {
                int val = frequencies.get(numRight);
                frequencies.put(numRight, val + 1);
            } else
                frequencies.put(numRight, 1);

            while(frequencies.get(numRight) > k) {
                int numLeft = nums[left];
                int freq = frequencies.get(numLeft);
                if(freq == 1)
                    frequencies.remove(numLeft);
                else
                    frequencies.put(numLeft, freq - 1);
                ++left;
            }
            longest = Math.max(right - left + 1, longest);
            ++right;
        }

        return longest;
    }
}
