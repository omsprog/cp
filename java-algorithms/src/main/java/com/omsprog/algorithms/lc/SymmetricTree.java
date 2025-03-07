package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;

        TreeNode t1 = root.left;
        TreeNode t2 = root.right;

        Deque<TreeNode> q1 = new ArrayDeque<>();
        Deque<TreeNode> q2 = new ArrayDeque<>();

        if(t1 != null) q1.offer(t1);
        if(t2 != null) q2.offer(t2);

        while(!q1.isEmpty()) {
            if(q1.size() != q2.size()) return false;

            int qSize = q1.size();

            for(int i = 0; i < qSize; i++) {
                TreeNode node1 = q1.poll();
                TreeNode node2 = q2.poll();

                if(node1.val != node2.val) return false;

                if(node1.left == null && node2.right != null) return false;
                if(node1.left != null && node2.right == null) return false;
                if(node1.right == null && node2.left != null) return false;
                if(node1.right != null && node2.left == null) return false;

                if(node1.left != null) q1.offer(node1.left);
                if(node2.right != null) q2.offer(node2.right);
                if(node1.right != null) q1.offer(node1.right);
                if(node2.left != null) q2.offer(node2.left);
            }
        }

        return q1.isEmpty() && q2.isEmpty();
    }
}
