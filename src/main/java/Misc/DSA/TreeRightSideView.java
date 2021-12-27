package Misc.DSA;

import java.util.ArrayList;
import java.util.List;

public class TreeRightSideView {
    //from right to left we are traversing level by level and first element is being added in list.
    //once the first element is added in list for that level,other elements will not be added
    //in level 0,0 element in result,level 1-(0+1)=1 element,level 2 -(1+1)=2 elemnts will be there in list;

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList list = new ArrayList();
        rightSideView(root, 0, list);
        return list;
    }

    private void rightSideView(TreeNode root, int level, ArrayList list) {
        if (root == null)
            return;
        if (level == list.size())
            list.add(root.val);
        rightSideView(root.right, level + 1, list);
        rightSideView(root.left, level + 1, list);
    }
}
