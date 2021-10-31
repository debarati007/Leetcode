package Misc.DSA;
//as per question For this problem, a height-balanced binary tree is defined as:
//a binary tree in which the left and right subtrees of every node differ in height by no more than 1.
//so we are calculating height for left and right subtree and recursively checking for each sub trees
//if this condition is fulfilled.
//during recursion if at any point its not fulfilled,flag is set as false;
public class TreeBalanceCheck {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        getHeight(root);
        return flag;

    }

    private int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        int max = 1 + Math.max(leftHeight, rightHeight);
        if ((Math.abs(leftHeight - rightHeight) > 1))
            flag = false;
        return max;
    }
}
