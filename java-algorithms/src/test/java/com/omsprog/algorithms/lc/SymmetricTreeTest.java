package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {
    @Test
    void test() {
        SymmetricTree sT = new SymmetricTree();
        TreeNode root1 = new TreeNode(1);

        TreeNode node1 = new TreeNode(2);
        node1.left = new TreeNode(3);
        node1.right = new TreeNode(4);

        TreeNode node2 = new TreeNode(2);
        node2.left = new TreeNode(4);
        node2.right = new TreeNode(3);

        root1.left = node1;
        root1.right = node2;

        assertEquals(true, sT.isSymmetric(root1));
    }
}