package com.omsprog.algorithms.leetcode.medium.rotateimage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImageTest {
    @Test
    void test() {
        RotateImage rotateImage = new RotateImage();
        int[][] originalArray1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        rotateImage.rotate(originalArray1);
        assertArrayEquals(new int[][] {{7,4,1},{8,5,2},{9,6,3}}, originalArray1);

        int[][] originalArray2 = new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotateImage.rotate(originalArray2);
        assertArrayEquals(new int[][] {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}}, originalArray2);
    }
}