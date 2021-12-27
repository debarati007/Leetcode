package Misc.DSA;

public class TreeKthSmallest {
    public int count = 0;
    int result = Integer.MIN_VALUE;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;

    }

    public void inorder(TreeNode root, int k) {
        if (root == null)
            return;
        kthSmallest(root.left, k);
        count++;
        if (count == k)
            result = root.val;
        kthSmallest(root.right, k);

    }
}
