package com.omsprog.algorithms.lc;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;

        int pointerA = 0;
        int pointerB = nums.length - 1;

        while (pointerA <= pointerB) {
            int midPoint = pointerA + (pointerB - pointerA) / 2;

            if (midPoint == 0 || midPoint == nums.length - 1) {
                if (midPoint == 0)
                    return nums[midPoint] > nums[midPoint + 1] ? midPoint : midPoint + 1;
                else
                    return nums[midPoint] > nums[midPoint - 1] ? midPoint : midPoint - 1;
            } else {
                if (nums[midPoint] > nums[midPoint - 1] && nums[midPoint] > nums[midPoint + 1])
                    return midPoint;
                else {
                    if (nums[midPoint] < nums[midPoint + 1])
                        pointerA = midPoint + 1;
                    else
                        pointerB = midPoint - 1;
                }
            }
        }
        return -1;
    }
}
