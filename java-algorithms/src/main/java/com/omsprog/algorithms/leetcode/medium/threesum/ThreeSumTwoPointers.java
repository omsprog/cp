package com.omsprog.algorithms.leetcode.medium.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTwoPointers {
    // a + b + c = 0  =>  -a = b + c
    private List<List<Integer>> twoSum(int[] nums, int startIndex, int target) {
        int left = startIndex;
        int right = nums.length - 1;
        List<List<Integer>> solutions = new ArrayList<>();

        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum < target)
                ++left;
            else if(sum > target)
                --right;
            else {
                List<Integer> solution = List.of(nums[left], nums[right]);
                solutions.add(solution);
                int numberAtLeft = nums[left];
                // skipping duplicates - left pointer
                while(left < right && nums[left] == numberAtLeft) ++left;
            }
        }

        return solutions;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> solution = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            List<List<Integer>> triplets = twoSum(nums, i + 1, - nums[i]);
            if(!triplets.isEmpty()) {
                for(List<Integer> triplet : triplets) {
                    List<Integer> newTriplet = List.of(nums[i], triplet.get(0), triplet.get(1));
                    solution.add(newTriplet);
                }
            }
        }

        return solution;
    }
}
