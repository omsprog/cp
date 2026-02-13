package com.omsprog.algorithms.leetcode.easy.distributecandiestopeople;

public class DistributeCandiesToPeople {
    public int[] distributeCandies(int candies, int numPeople) {
        int[] candyDist = new int[numPeople];
        int circularIndex = 0;
        int candiesToGive = 1;

        while(candies > 0) {
            if(candies - candiesToGive < 0)
                candiesToGive = candies;

            candies -= candiesToGive;
            candyDist[circularIndex] += candiesToGive;

            if(circularIndex == numPeople - 1) circularIndex = 0;
            else ++circularIndex;
            ++candiesToGive;
        }

        return candyDist;
    }
}
