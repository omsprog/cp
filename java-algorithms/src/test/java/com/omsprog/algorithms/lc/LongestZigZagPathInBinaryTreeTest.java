package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestZigZagPathInBinaryTreeTest {
    @Test
    void test() {
        LongestZigZagPathInBinaryTree lZ = new LongestZigZagPathInBinaryTree();

        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(1);
        root.right = n1;
        n1.left = new TreeNode(1);
        TreeNode n2 = new TreeNode(1);
        n1.right = n2;
        n2.right = new TreeNode(1);
        TreeNode n3 = new TreeNode(1);
        n2.left = n3;
        n3.right = new TreeNode(1);

        assertEquals(3, lZ.longestZigZag(root));
    }
}