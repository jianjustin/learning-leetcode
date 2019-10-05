public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (null == p || null == q)return p==q;
        if (p.val != q.val)
            return false;
        else
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
