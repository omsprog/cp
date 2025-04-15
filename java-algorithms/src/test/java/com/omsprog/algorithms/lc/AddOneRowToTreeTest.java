package com.omsprog.algorithms.lc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddOneRowToTreeTest {
    @Test
    void test() {
        AddOneRowToTree aO = new AddOneRowToTree();
        TreeNode root = new TreeNode(4);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(6);
        n1.left = new TreeNode(3);
        n1.right = new TreeNode(1);
        n2.left = new TreeNode(5);
        root.left = n1;
        root.right = n2;
        // TODO: test
        aO.addOneRow(root,1,2);
    }
}