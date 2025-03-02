package com.omsprog.algorithms.lc;

public class MergeTwo2DArraysBySummingValues {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int pA = 0;
        int pB = 0;
        int pR = 0;
        int[][] rAux = new int[nums1.length + nums2.length][2];

        while(true) {
            boolean aOutOfB = pA >= nums1.length;
            boolean bOutOfB = pB >= nums2.length;

            if(aOutOfB && bOutOfB) break;

            if(!aOutOfB && !bOutOfB) {
                int[] eA = nums1[pA];
                int[] eB = nums2[pB];

                if(eA[0] == eB[0]) { // keys are the same
                    rAux[pR] = new int[] {eA[0], eA[1] + eB[1]};
                    ++pA;
                    ++pB;
                } else if(eA[0] < eB[0]) {
                    rAux[pR] = nums1[pA];
                    ++pA;
                } else {
                    rAux[pR] = nums2[pB];
                    ++pB;
                }
                ++pR;
            } else if(aOutOfB) {
                rAux[pR] = nums2[pB];
                ++pB;
                ++pR;
            } else {
                rAux[pR] = nums1[pA];
                ++pA;
                ++pR;
            }
        }

        int[][] r = new int[pR][2];
        for(int i = 0; i < pR; i++)
            r[i] = rAux[i];
        return r;
    }
}
