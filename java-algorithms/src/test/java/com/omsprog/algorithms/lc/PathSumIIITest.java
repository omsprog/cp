package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSumIIITest {
    @Test
    void test() {
        TreeNode root = new TreeNode(10);
        TreeNode n1 = new TreeNode(5);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(-2);
        TreeNode n5 = new TreeNode(2);
        TreeNode n6 = new TreeNode(1);
        TreeNode n7 = new TreeNode(-3);
        TreeNode n8 = new TreeNode(11);

        root.left = n1;
        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n1.right = n5;
        n5.right = n6;
        root.right = n7;
        n7.right = n8;

        PathSumIII pS = new PathSumIII();
        assertEquals(3, pS.pathSum(root, 8));
    }
}