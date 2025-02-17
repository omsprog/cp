package com.omsprog.algorithms.lc;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int greatest = 0;

        // find the greatest
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > greatest)
                greatest = candies[i];
        }

        for(int candy : candies) {
            result.add(candy + extraCandies >= greatest);
        }

        return result;
    }
}
