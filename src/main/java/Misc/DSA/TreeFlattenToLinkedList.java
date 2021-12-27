package Misc.DSA;

public class TreeFlattenToLinkedList {
    //if we traverse the flattened result list in reverse way we get the tree in right-left-root order
    //reverse-preorder
    //traverse the original tree in root-right-left this way
    //and then set each node's right pointer as the previous one in [6->5->4->3->2->1],
    // as such the right pointer behaves similar to a link in the flattened tree(though technically,
    // it's still a right child reference from the tree data structure's perspective)
    // and set the left child as null before the end of one recursion by

    private TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;

    }

}
