package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceElementsWithGreatestElementOnRightSideTest {
    @Test
    void test() {
        ReplaceElementsWithGreatestElementOnRightSide rE = new ReplaceElementsWithGreatestElementOnRightSide();
        assertArrayEquals(new int[] {18,6,6,6,1,-1}, rE.replaceElements(new int[] {17,18,5,4,6,1}));
        assertArrayEquals(new int[] {-1}, rE.replaceElements(new int[] {400}));
    }
}