package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountGoodNodesInBinaryTreeTest {
    @Test
    void test() {
        CountGoodNodesInBinaryTree cG = new CountGoodNodesInBinaryTree();
        TreeNode root = new TreeNode(3);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(5);

        root.left = n1;
        n1.left = n2;
        root.right = n3;
        n3.left = n4;
        n3.right = n5;

        assertEquals(4, cG.goodNodes(root));
    }
}