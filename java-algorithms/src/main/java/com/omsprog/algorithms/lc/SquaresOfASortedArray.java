package com.omsprog.algorithms.lc;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int pointerA = 0;
        int numberOfElements = nums.length;
        int pointerB = numberOfElements - 1;
        int[] sortedSquares = new int[numberOfElements];


        while(pointerA != pointerB) {
            --numberOfElements;

            int absoluteA = Math.abs(nums[pointerA]);
            int absoluteB = Math.abs(nums[pointerB]);

            if(absoluteA > absoluteB) {
                sortedSquares[numberOfElements] = absoluteA * absoluteA;
                ++pointerA;
            } else {
                sortedSquares[numberOfElements] = absoluteB * absoluteB;
                --pointerB;
            }
        }

        sortedSquares[0] = Math.abs(nums[pointerA]) * Math.abs(nums[pointerA]);

        return sortedSquares;
    }
}
