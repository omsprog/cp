package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < asteroids.length; i++) {
            int asteroid = asteroids[i];

            if(asteroid > 0) {
                stack.push(asteroid);
            } else { //  asteroid <-
                Integer peek = stack.peek();

                if(peek == null)
                    stack.push(asteroid);
                else if(peek != null && peek < 0) // <- <-
                    stack.push(asteroid);
                else if(peek != null && peek > 0) { // ->  <-
                    if(Math.abs(peek) > Math.abs(asteroid)) { // upcoming asteroid was destroyed
                        // do nothing
                    } else if(Math.abs(peek) == Math.abs(asteroid)) { // destroy both top and upcoming asteroid
                        stack.pop();
                    } else if(Math.abs(peek) < Math.abs(asteroid)) { // upcoming asteroid is destroying some asteroid in stack
                        // keep popping as long as ...
                        while(stack.peek() != null && stack.peek() > 0 && Math.abs(stack.peek()) < Math.abs(asteroid)) {
                            stack.pop();
                        }

                        if(stack.peek() == null)
                            stack.push(asteroid);
                        else {
                            if(stack.peek() < 0) {
                                stack.push(asteroid);
                            } else if(Math.abs(stack.peek()) == Math.abs(asteroid)) {
                                stack.pop();
                            }
                        }
                    }
                }
            }
        }

        // transform stack to array
        int[] answer = new int[stack.size()];
        for(int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
