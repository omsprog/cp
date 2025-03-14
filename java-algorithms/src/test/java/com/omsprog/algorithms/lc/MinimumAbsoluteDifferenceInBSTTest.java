package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAbsoluteDifferenceInBSTTest {
    @Test
    void test() {
        TreeNode root = new TreeNode(4);
        TreeNode n1 = new TreeNode(2);
        n1.left = new TreeNode(1);
        n1.right = new TreeNode(3);
        root.left = n1;
        root.right = new TreeNode(6);

        MinimumAbsoluteDifferenceInBST mAD = new MinimumAbsoluteDifferenceInBST();
        assertEquals(1, mAD.getMinimumDifference(root));
    }
}