package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumberOfRecentCalls {
    Deque<Integer> queue;

    public NumberOfRecentCalls() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.offer(t);

        int a = t - 3000;

        while(queue.peek() < a) {
            queue.poll();
        }

        return queue.size();
    }
}
