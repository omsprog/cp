package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorOfABinaryTreeTest {
    @Test
    void test() {
        LowestCommonAncestorOfABinaryTree lC = new LowestCommonAncestorOfABinaryTree();

        TreeNode root = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(3);
        root.left = n1;
        root.right = n2;

        assertEquals(root, lC.lowestCommonAncestor(root, n1, n2));
    }
}