package com.omsprog.algorithms.lc;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] pairs = new int[spells.length];
        Arrays.sort(potions);

        for(int i = 0; i < spells.length; i++) {
            int min = (int)Math.ceil((double)success / spells[i]);

            int a = 0;
            int b = potions.length;

            while(a < b) {
                int mid = (a + b) / 2;
                if(potions[mid] < min)
                    a = mid + 1;
                else
                    b = mid;
            }

            pairs[i] = potions.length - a;
        }

        return pairs;
    }
}
