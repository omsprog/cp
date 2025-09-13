package com.omsprog.algorithms.leetcode.easy.mostfrequentevenelement;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> memory = new HashMap<>();
        for(int num : nums) {
            if(num % 2 == 0) {
                if(memory.containsKey(num)) {
                    int cur = memory.get(num);
                    memory.put(num, cur + 1);
                } else
                    memory.put(num, 1);
            }
        }
        int num = -1;
        int freq = 0;

        for(Map.Entry<Integer, Integer> entry : memory.entrySet()) {
            int currentVal = entry.getKey();
            int currentFreq = entry.getValue();
            if(currentFreq > freq) {
                num = currentVal;
                freq = currentFreq;
            }
            if(currentFreq == freq && currentVal < num)
                num = currentVal;
        }

        return num;
    }
}
