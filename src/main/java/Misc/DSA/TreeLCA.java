package Misc.DSA;

public class TreeLCA {
    /*
    If the given both nodes values are less than that of root, then both the nodes must be on the left side of the root , so now we have to check only left tree of the root.
Otherwise If the given both nodes values are greater than that of root, then both the nodes must be on the right side of the root , so now we have to check only right tree of the root.
Otherwise . both the nodes will be on the either side of the root, this implies the lowest common ancestor is root.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.left==p && root.right==q)
            return root;
        if(p.val>root.val && q.val>root.val)
            return lowestCommonAncestor(root.right,p,q);
        if(p.val<root.val && q.val<root.val)
            return lowestCommonAncestor(root.left,p,q);
        return root;
    }
}
