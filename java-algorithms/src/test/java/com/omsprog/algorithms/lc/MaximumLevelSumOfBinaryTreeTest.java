package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLevelSumOfBinaryTreeTest {
    @Test
    void test() {
        MaximumLevelSumOfBinaryTree mL = new MaximumLevelSumOfBinaryTree();
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(0);
        TreeNode root1N1 = new TreeNode(7);
        root1.left = root1N1;
        root1N1.left = new TreeNode(7);
        root1N1.right = new TreeNode(-8);

        assertEquals(2, mL.maxLevelSum(root1));
    }
}