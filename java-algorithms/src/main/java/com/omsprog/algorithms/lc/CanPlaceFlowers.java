package com.omsprog.algorithms.lc;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowerbedLength = flowerbed.length;
        int possibleFlowers = 0;

        // edge case
        if(flowerbedLength == 1) {
            if(flowerbed[0] == 0)
                return n <= 1;
            if(flowerbed[0] == 1)
                return n == 0;
        }

        for(int i = 0; i < flowerbed.length; i++) {
            int left = i == 0 ? 0 : i - 1;
            int center = i;
            int right = i == flowerbedLength - 1 ? flowerbedLength - 1 : i + 1;

            if(flowerbed[left] == 0 && flowerbed[center] == 0 && flowerbed[right] == 0) {
                flowerbed[i] = 1;
                possibleFlowers++;
            }
        }

        return possibleFlowers >= n;
    }
}
