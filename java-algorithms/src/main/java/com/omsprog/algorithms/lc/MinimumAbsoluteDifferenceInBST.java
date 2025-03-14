package com.omsprog.algorithms.lc;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST {
    private void inorder(TreeNode root, List<Integer> list) {
        if(root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public int getMinimumDifference(TreeNode root) {
        if(root == null) return 0;

        List<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);
        if(inorder.size() == 1) return 0;

        int min = Integer.MAX_VALUE;
        for(int i = 1; i < inorder.size(); i++) {
            int delta = inorder.get(i) - inorder.get(i - 1);
            min = Math.min(delta, min);
        }

        return min;
    }
}
