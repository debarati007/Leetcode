package Misc.DSA;

import java.util.ArrayList;
import java.util.List;
/*
A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 */
//The inorder traversal of a binary search tree should be a sorted array.
public class TreeValidate {
    List<Integer> nodes = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        inorder(root);
        System.out.println(nodes);
        return isSorted(nodes);

    }

    private List<Integer> inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            nodes.add(root.val);
            inorder(root.right);
        }
        return nodes;
    }

    private boolean isSorted(List l) {
        for (int i = 1; i < nodes.size(); i++) {
            if (nodes.get(i - 1) >= nodes.get(i))
                return false;
        }
        return true;
    }
}
