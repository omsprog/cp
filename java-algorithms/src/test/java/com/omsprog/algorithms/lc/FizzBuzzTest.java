package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void test() {
        FizzBuzz fB = new FizzBuzz();
        assertArrayEquals(new String[] {"1", "2", "Fizz"}, fB.fizzBuzz(3).toArray());
        assertArrayEquals(new String[] {"1","2","Fizz","4","Buzz"}, fB.fizzBuzz(5).toArray());
    }
}