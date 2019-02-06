package com.matianxing.algorithm;

public class DeepthSearchFirst {
    public static void test(TreeNode node){
//        if(node==null) return false;
        System.out.println(node.val);
        if(node.left != null) test(node.left);
        if(node.right !=null) test(node.right);

//        return test(node.left) || test(node.right);
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

        test(root);

    }


}
