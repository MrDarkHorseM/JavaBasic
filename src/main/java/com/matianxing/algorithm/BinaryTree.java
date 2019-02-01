package com.matianxing.algorithm;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

//        public List<Integer> largestValues(TreeNode root) {
//            Queue<TreeNode> queue = new LinkedList<TreeNode>();
//
//            List<Integer> res = new LinkedList<Integer>();
//            if (root == null) return res;
//
//            queue.offer(root);
//            while (!queue.isEmpty()) {
//                int levelNum = queue.size();
//                int temp = queue.peek().val;
//                if (queue.peek().left != null) queue.offer(queue.peek().left);
//                if (queue.peek().right != null) queue.offer(queue.peek().right);
//                queue.poll();
//                for (int i = 1; i < levelNum; i++) {
//                    if (queue.peek().val > temp) temp = queue.peek().val;
//                    if (queue.peek().left != null) queue.offer(queue.peek().left);
//                    if (queue.peek().right != null) queue.offer(queue.peek().right);
//                    queue.poll();
//                }
//                res.add(temp);
//            }
//            return res;
//        }

    public static List<Integer> largestValues(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        List<Integer> res = new LinkedList<>();
        if (root == null) return res;

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            int temp = queue.peek().val;

            if (queue.peek().left != null) queue.offer(queue.peek().left);
            if (queue.peek().right != null) queue.offer(queue.peek().right);

            queue.poll();

            for (int i = 1; i < levelNum; i++) {
                if (queue.peek().val > temp) temp = queue.peek().val;
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                queue.poll();
            }
            res.add(temp);
        }
        System.out.println(res);
        return res;
        }

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);

        TreeNode l = new TreeNode(3);

        TreeNode r = new TreeNode(7);

        root.left = l;

        root.right = r;

        TreeNode ll = new TreeNode(5);

        l.left = ll;

        TreeNode lr = new TreeNode(8);

        l.right = lr;

        TreeNode rl = new TreeNode(9);

        r.right = rl;

        TreeNode rr = new TreeNode(10);

        largestValues(root);

    }



}








