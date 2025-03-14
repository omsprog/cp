package com.omsprog.algorithms.lc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return new ArrayList<>();

        Deque<TreeNode> queue = new ArrayDeque<>();

        queue.offer(root);

        List<Integer> largest = new ArrayList<>();

        while(!queue.isEmpty()) {
            int size = queue.size();
            int largestEle = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                largestEle = Math.max(node.val, largestEle);
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            largest.add(largestEle);
        }

        return largest;
    }
}
