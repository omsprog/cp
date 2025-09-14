package com.omsprog.algorithms.leetcode.medium.maximizetheconfusionofanexam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximizeTheConfusionOfAnExamTest {
    @Test
    void test() {
        MaximizeTheConfusionOfAnExam mTCOAE = new MaximizeTheConfusionOfAnExam();
        assertEquals(4, mTCOAE.maxConsecutiveAnswers("TTFF", 2));
        assertEquals(3, mTCOAE.maxConsecutiveAnswers("TFFT", 1));
        assertEquals(5, mTCOAE.maxConsecutiveAnswers("TTFTTFTT", 1));
    }
}