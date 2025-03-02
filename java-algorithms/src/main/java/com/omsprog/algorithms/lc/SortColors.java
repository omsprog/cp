package com.omsprog.algorithms.lc;

public class SortColors {
    public void sortColors(int[] nums) {
        int countA = 0;
        int countB = 0;
        int countC = 0;

        for(int i = 0; i < nums.length; i++) {
            int cV = nums[i];
            if(cV == 0) ++countA;
            if(cV == 1) ++countB;
            if(cV == 2) ++countC;
        }

        int globalIndex = 0;
        for(int i = 0; i < countA; i++) {
            nums[globalIndex] = 0;
            ++globalIndex;
        }
        for(int i = 0; i < countB; i++) {
            nums[globalIndex] = 1;
            ++globalIndex;
        }
        for(int i = 0; i < countC; i++) {
            nums[globalIndex] = 2;
            ++globalIndex;
        }
    }
}
