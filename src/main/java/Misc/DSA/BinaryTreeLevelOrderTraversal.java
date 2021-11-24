package Misc.DSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> wrapList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
            while (!queue.isEmpty()) {
                List<Integer> sublist = new ArrayList<>();
                int level = queue.size();
                for (int i = 0; i < level; i++) {
                    if (queue.peek().left != null)
                        queue.offer(queue.peek().left);
                    if (queue.peek().right != null)
                        queue.offer(queue.peek().right);
                    sublist.add(queue.poll().val);
                }
                wrapList.add(sublist);
            }
        }
        return wrapList;
    }
}
