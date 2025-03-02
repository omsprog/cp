package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumLevelSumOfBinaryTree {
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int level = 0;
        int lCounter = 0;
        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root);

        while(!queue.isEmpty()) {
            int lSum = 0;
            ++lCounter;
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                lSum = lSum + node.val;

                if(node.left != null)
                    queue.offer(node.left);

                if(node.right != null)
                    queue.offer(node.right);
            }
            if(lSum > max) {
                max = lSum;
                level = lCounter;
            }
        }

        return level;
    }
}
