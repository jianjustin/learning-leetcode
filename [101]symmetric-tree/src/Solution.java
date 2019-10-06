public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (null == root)return true;
        return isMirror(root.left , root.right);
    }

    public boolean isMirror(TreeNode t1 , TreeNode t2){
        if (null == t1 && null == t2)return true;
        if (null == t1 || null == t2)return false;
        if (t1.val != t2.val)return false;
        if (isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left))return true;
        return false;
    }

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }
}
