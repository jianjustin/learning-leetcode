public class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepth(root,0);
    }

    public int maxDepth(TreeNode root , int depth) {
        if (null == root)return depth;
        int max = maxDepth(root.left,depth+1);
        int item = maxDepth(root.right,depth+1);
        if (max < item)max = item;
        return max;
    }

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }
}
