package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.Deque;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null)
            return true;
        if(p != null && q == null)
            return false;
        if(p == null && q != null)
            return false;

        Deque<TreeNode> q1 = new ArrayDeque<>();
        Deque<TreeNode> q2 = new ArrayDeque<>();

        q1.offer(p);
        q2.offer(q);

        while(!q1.isEmpty()) {
            int s1 = q1.size();
            int s2 = q2.size();

            if(s1 != s2) return false;

            for(int i = 0; i < s1; i++) {
                TreeNode n1 = q1.poll();
                TreeNode n2 = q2.poll();

                if(n1.val != n2.val) return false;

                if(n1.left == null && n2.left != null) return false;
                if(n1.left != null && n2.left == null) return false;
                if(n1.right == null && n2.right != null) return false;
                if(n1.right != null && n2.right == null) return false;

                if(n1.left != null) {
                    q1.offer(n1.left);
                    q2.offer(n2.left);
                }

                if(n1.right != null) {
                    q1.offer(n1.right);
                    q2.offer(n2.right);
                }
            }
        }

        return q1.size() == q2.size();
    }
}
