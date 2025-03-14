package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        int leftmost = -1;

        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(i == 0) {
                    leftmost = node.val;
                }
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
        }

        return leftmost;
    }
}
