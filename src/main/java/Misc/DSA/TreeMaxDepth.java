package Misc.DSA;

public class TreeMaxDepth {
    int maxDepth=0;
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return (1+Math.max(maxDepth(root.left),maxDepth(root.right)));
    }
}
