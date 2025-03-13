package com.omsprog.algorithms.lc;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {
    private void buildInOrderList(TreeNode node, List<Integer> list) {
        if(node == null) return;
        buildInOrderList(node.left, list);
        list.add(node.val);
        buildInOrderList(node.right, list);
    }

    public boolean isValidBST(TreeNode root) {
        if(root == null || (root.left == null && root.right == null)) return true;
        List<Integer> inorderL = new ArrayList<>();
        buildInOrderList(root, inorderL);
        for(int i = 1; i < inorderL.size(); i++)
            if(inorderL.get(i-1) >= inorderL.get(i)) return false;

        return true;
    }
}
