package Misc.DSA;

// if you find a node with either of right or left is absent, return the maximum of left/right because one of them is 0 anyway.

public class TreeMinDepth {
    int minimumDepth=0;
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null || root.right==null){
            return (1+Math.max(minDepth(root.left),minDepth(root.right)));
        }
        return (1+Math.min(minDepth(root.left),minDepth(root.right)));
    }
}
