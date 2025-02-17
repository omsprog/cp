package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(String operation : operations) {
            if(operation.equals("C"))
                stack.pop();
            else if(operation.equals("D")) {
                int previousNumber = stack.peek();
                stack.push(previousNumber*2);
            } else if(operation.equals("+")) {
                int previousNumber = stack.pop();
                int previousPreviousNumber = stack.peek();
                int sum = previousNumber + previousPreviousNumber;
                stack.push(previousNumber);
                stack.push(sum);
            } else // operation is a number
                stack.push(Integer.parseInt(operation));

        }

        int sum = 0;
        while(!stack.isEmpty())
            sum += stack.pop();

        return sum;
    }
}
