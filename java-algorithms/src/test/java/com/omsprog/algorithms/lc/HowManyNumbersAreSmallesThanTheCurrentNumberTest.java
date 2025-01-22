package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class HowManyNumbersAreSmallesThanTheCurrentNumberTest {

    @Test
    void test() {
        HowManyNumbersAreSmallesThanTheCurrentNumber hMN = new HowManyNumbersAreSmallesThanTheCurrentNumber();
        assertArrayEquals(new int[] { 4, 0, 1, 1, 3 }, hMN.smallerNumbersThanCurrent(new int[] {8, 1, 2, 2, 3}));
    }
}