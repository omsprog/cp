package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;
import com.omsprog.algorithms.util.TestUtil;
import static org.junit.jupiter.api.Assertions.*;

class ConvertBinaryNumberInLinkedListToIntegerTest {
    @Test
    void test() {
        ConvertBinaryNumberInLinkedListToInteger cBN = new ConvertBinaryNumberInLinkedListToInteger();
        assertEquals(5, cBN.getDecimalValue(TestUtil.buildLinkedList(new int[] {1,0,1})));
    }
}