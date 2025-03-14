package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindLargestValueInEachTreeRowTest {
    @Test
    void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        FindLargestValueInEachTreeRow fL = new FindLargestValueInEachTreeRow();
        assertEquals(List.of(1,3,9), fL.largestValues(root));
    }
}