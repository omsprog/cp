package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeRightSideViewTest {
    @Test
    void test() {
        BinaryTreeRightSideView bT = new BinaryTreeRightSideView();

        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);

        root.left = n1;
        root.right = n3;
        n1.right = n2;
        n3.right = n4;

        assertEquals(List.of(1,3,4), bT.rightSideView(root));
    }
}