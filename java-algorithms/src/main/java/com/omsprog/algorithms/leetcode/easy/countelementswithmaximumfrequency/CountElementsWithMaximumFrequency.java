package com.omsprog.algorithms.leetcode.easy.countelementswithmaximumfrequency;

public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int[] frequencies = new int[101];
        int maximumFrequency = 0;
        int result = 0;

        for(int n : nums) {
            int newFrequency = frequencies[n] + 1;
            frequencies[n] = newFrequency;
            maximumFrequency = Math.max(maximumFrequency, newFrequency);
        }

        for(int i = 0; i <= 100; i++)
            if(frequencies[i] == maximumFrequency)
                result += maximumFrequency;

        return result;
    }
}
