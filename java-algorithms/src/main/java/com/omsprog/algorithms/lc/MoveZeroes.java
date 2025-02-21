package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();

        int numberOfZeroes = 0;

        for(int num : nums) {
            if(num == 0)
                ++numberOfZeroes;
            else
                stack.push(num);
        }

        if(numberOfZeroes == 0 || numberOfZeroes == nums.length)
            return;

        for(int i = 0; i < numberOfZeroes; i ++)
            nums[nums.length -1 -i] = 0;

        int offset = 0;
        while(!stack.isEmpty()) {
            ++offset;
            nums[nums.length -offset - numberOfZeroes] = stack.pop();
        }
    }
}
