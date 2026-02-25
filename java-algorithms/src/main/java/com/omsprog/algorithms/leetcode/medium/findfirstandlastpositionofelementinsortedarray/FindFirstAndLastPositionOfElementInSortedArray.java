package com.omsprog.algorithms.leetcode.medium.findfirstandlastpositionofelementinsortedarray;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int r = binarySearch(nums, target);
        if(r == -1) return new int[] {-1, -1};
        int f = findFirstPosition(nums, target, r);
        int l = findLastPosition(nums, target, r);
        return new int[] {f,l};
    }

    private int findFirstPosition(int[] nums, int target, int bound) {
        int l = 0, r = bound;
        int first = bound;
        while(l <= r) {
            int mid = l + (r - l)/2;
            if(nums[mid] == target) {
                first = mid;
                r = mid - 1;
            } else if(nums[mid] < target) {
                l = mid + 1;
            } else
                r = mid - 1;
        }
        return first;
    }

    private int findLastPosition(int[] nums, int target, int bound) {
        int l = bound, r = nums.length - 1;
        int last = bound;
        while(l <= r) {
            int mid = l + (r - l)/2;
            if(nums[mid] == target) {
                last = mid;
                l = mid + 1;
            } else if(nums[mid] > target) {
                r = mid - 1;
            } // if(nums[mid] < target) is an impossible scenario
        }
        return last;
    }

    private int binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r) {
            int m = l + (r - l)/2;
            if(nums[m] == target) return m;
            if(nums[m] < target)
                l = m + 1;
            else
                r = m - 1;

        }
        return -1;
    }
}
