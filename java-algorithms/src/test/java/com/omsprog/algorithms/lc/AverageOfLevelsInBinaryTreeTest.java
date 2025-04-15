package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfLevelsInBinaryTreeTest {
    @Test
    void test() {
        AverageOfLevelsInBinaryTree aO = new AverageOfLevelsInBinaryTree();

        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        TreeNode n1 = new TreeNode(20);
        n1.left = new TreeNode(15);
        n1.right = new TreeNode(7);
        root1.right = n1;

        assertEquals(List.of(3.00000,14.50000,11.00000), aO.averageOfLevels(root1));

        TreeNode root2 = new TreeNode(3);
        TreeNode n2 = new TreeNode(9);
        n2.left = new TreeNode(15);
        n2.right = new TreeNode(7);
        root2.left = n2;
        root2.right = new TreeNode(20);

        assertEquals(List.of(3.00000,14.50000,11.00000), aO.averageOfLevels(root2));
    }
}