package com.omsprog.algorithms.leetcode.medium.containerwithmostwater;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right) {
            int localArea = (right - left) * Math.min(height[left], height[right]);

            if(localArea > maxArea) maxArea = localArea;

            if(height[left] > height[right])
                --right;
            else
                ++left;
        }

        return maxArea;
    }
}
