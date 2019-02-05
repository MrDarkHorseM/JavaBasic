package com.matianxing.algorithm;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {

    public static List<Integer> largestValues(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        List<Integer> res = new LinkedList<>();
        if (root == null) return res;

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            int temp = queue.peek().val; //return the first element.


            TreeNode firstNode = queue.poll();
            if (firstNode.left != null) queue.offer(firstNode.left);
            if (firstNode.right != null) queue.offer(firstNode.right);
//            if (queue.peek().left != null) queue.offer(queue.peek().left);
//            if (queue.peek().right != null) queue.offer(queue.peek().right);
//
//
//            queue.poll(); //return the first element, then delete it.

            for (int i = 1; i < levelNum; i++) {
                TreeNode tempNode = queue.poll();
                if (tempNode.val > temp) temp = tempNode.val;
                if (tempNode.left != null) queue.offer(tempNode.left);
                if (tempNode.right != null) queue.offer(tempNode.right);
//                if (queue.peek().val > temp) temp = queue.peek().val;
//                if (queue.peek().left != null) queue.offer(queue.peek().left);
//                if (queue.peek().right != null) queue.offer(queue.peek().right);
//                queue.poll();
            }

            res.add(temp);
        }
        System.out.println(res);
        return res;
        }

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);

        TreeNode l = new TreeNode(3);

        root.left = l;

        TreeNode r = new TreeNode(7);

        root.right = r;

        TreeNode ll = new TreeNode(5);

        l.left = ll;

        TreeNode lr = new TreeNode(8);

        l.right = lr;

        TreeNode rl = new TreeNode(9);

        r.left = rl;

        TreeNode rr = new TreeNode(10);

        r.right = rr;

        largestValues(root);

    }

}








