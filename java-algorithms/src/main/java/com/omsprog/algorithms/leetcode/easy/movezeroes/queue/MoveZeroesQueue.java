package com.omsprog.algorithms.leetcode.easy.movezeroes.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MoveZeroesQueue {
    public void moveZeroes(int[] nums) {
        Deque<Integer> queue = new ArrayDeque<>();

        for(int num : nums) {
            if(num != 0)
                queue.offer(num);
        }

        int index = 0;
        while(!queue.isEmpty()) {
            nums[index++] = queue.poll();
        }

        while(index < nums.length)
            nums[index++] = 0;
    }
}
