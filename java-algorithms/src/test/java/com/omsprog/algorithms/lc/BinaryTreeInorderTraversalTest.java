package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeInorderTraversalTest {
    @Test
    void test() {
        TreeNode root1 = new TreeNode(1);
        TreeNode n1root1 = new TreeNode(2);
        root1.right = n1root1;
        n1root1.left = new TreeNode(3);

        BinaryTreeInorderTraversal bT = new BinaryTreeInorderTraversal();
        assertEquals(List.of(1,3,2), bT.inorderTraversal(root1));
    }
}