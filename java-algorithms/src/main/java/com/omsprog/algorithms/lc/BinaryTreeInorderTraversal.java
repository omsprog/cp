package com.omsprog.algorithms.lc;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    private void inorder(TreeNode root, List<Integer> l) {
        if(root == null) return;
        inorder(root.left, l);
        l.add(root.val);
        inorder(root.right, l);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderL = new ArrayList<>();
        inorder(root, inorderL);
        return inorderL;
    }
}
