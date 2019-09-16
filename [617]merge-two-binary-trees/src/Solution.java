import java.util.Queue;

public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (null == t1)return t2;
        if (null == t2)return t1;
        t1.val += t2.val;
        mergeTrees(t1.left,t2.left);
        mergeTrees(t1.right,t2.right);
        return t1;
    }

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
