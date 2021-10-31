package Misc.DSA;

import Misc.DSA.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeIndorderTraversal {
    //uses recursion
    List<Integer> nodeList=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root!=null){
            inorderTraversal(root.left);
            nodeList.add(root.val);
            inorderTraversal(root.right);
        }
        return nodeList;
    }
    //using stack and iterative
    public List < Integer > inorderTraversalIterative(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        Stack< TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}
