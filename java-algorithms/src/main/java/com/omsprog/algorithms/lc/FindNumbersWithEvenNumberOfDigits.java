package com.omsprog.algorithms.lc;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int num : nums) {
            String s = new String("" + num);
            if(s.length() % 2 == 0) ++even;
        }

        return even;
    }
}
