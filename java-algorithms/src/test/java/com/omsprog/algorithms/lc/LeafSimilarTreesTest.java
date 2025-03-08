package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeafSimilarTreesTest {
    @Test
    void test() {
        LeafSimilarTrees lS = new LeafSimilarTrees();
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(2);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(2);

        assertTrue(lS.leafSimilar(root1, root2));
    }
}