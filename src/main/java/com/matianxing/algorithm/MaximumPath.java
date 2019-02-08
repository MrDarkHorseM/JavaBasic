package com.matianxing.algorithm;

public class MaximumPath {

    public int maxDepth(TreeNode node){

        if(node == null)
            return 0;
        else
            System.out.println(1 + Math.max(maxDepth(node.left), maxDepth(node.right)));
            return 1 + Math.max(maxDepth(node.left), maxDepth(node.right));


    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(3);

        TreeNode l = new TreeNode(9);

        root.left = l;

        TreeNode r = new TreeNode(20);

        root.right = r;

        TreeNode rl = new TreeNode(15);

        r.left = rl;

        TreeNode rr = new TreeNode(7);

        r.right = rr;

        MaximumPath instance = new MaximumPath();

        instance.maxDepth(root);

    }

}
