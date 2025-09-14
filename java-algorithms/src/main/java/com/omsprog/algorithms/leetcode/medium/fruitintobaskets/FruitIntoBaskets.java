package com.omsprog.algorithms.leetcode.medium.fruitintobaskets;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> memory = new HashMap<>();
        int maxLength = 0;
        int left = 0, right = 0;

        while(right < fruits.length) {
            int fruitR = fruits[right];
            if(memory.containsKey(fruitR)) {
                int cur = memory.get(fruitR);
                memory.put(fruitR, cur + 1);
            } else
                memory.put(fruitR, 1);

            while(memory.size() > 2) {
                int fruitL = fruits[left];
                int cur = memory.get(fruitL);
                if(cur == 1)
                    memory.remove(fruitL);
                else
                    memory.put(fruitL, cur - 1);
                ++left;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            ++right;
        }

        return maxLength;
    }
}
