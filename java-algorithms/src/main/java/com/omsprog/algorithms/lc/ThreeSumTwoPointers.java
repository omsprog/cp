package com.omsprog.algorithms.lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTwoPointers {
    // a + b + c = 0  =>  -a = b + c
    // -2 -1 -1 0 0 1 1 1 1 2 3
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int index = 0; index < nums.length - 2; index++) {
            if(index > 0 && nums[index] == nums[index - 1])
                continue;

            int current = nums[index];
            int target = -current;

            int left = index + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[left] + nums[right];
                if(sum == target) {
                    result.add(Arrays.asList(current, nums[left], nums[right]));

                    // move left pointer skipping duplicates
                    while(left < right && nums[left] == nums[left + 1])
                        ++left;
                    ++left;
                    // move right pointer skipping duplicates
                    while(right > left && nums[right] == nums[right - 1])
                        --right;
                    --right;
                } else if(sum < target)
                    ++left;
                else
                    --right;
            }
        }

        return result;
    }
}
