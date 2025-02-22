package com.omsprog.algorithms.lc;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int pointerA = 0;
        int pointerB = height.length - 1;
        int maxArea = 0;

        while(pointerA != pointerB) {
            int localArea = (pointerB - pointerA) * Math.min(height[pointerA], height[pointerB]);

            if(localArea > maxArea) maxArea = localArea;

            if(height[pointerA] > height[pointerB])
                --pointerB;
            else
                ++pointerA;
        }

        return maxArea;
    }
}
