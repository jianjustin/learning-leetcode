import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (null == root)return result;

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;//层次计数器
        List<Integer> item = new ArrayList<Integer>();

        while (!queue.isEmpty()) {
            if (0 == count){
                item = new ArrayList<Integer>();
                result.add(item);
                count = queue.size();
            }
            TreeNode node = queue.poll();
            item.add(node.val);
            count--;
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        Collections.reverse(result);

        return result;
    }

    public void levelTraverse(TreeNode root) {
        if (root == null) return;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val+"  ");
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }


    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode createBinaryTreeByArray(int []array,int index)
    {
        TreeNode tn = null;
        if (index<array.length) {
            int value = array[index];
            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2*index+1);
            tn.right = createBinaryTreeByArray(array, 2*index+2);
            return tn;
        }
        return tn;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3,9,20,-1,-1,15,7};
        TreeNode root = createBinaryTreeByArray(a,0);
        List<List<Integer>> result = solution.levelOrderBottom(root);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j)+",");
            }
            System.out.println();
        }
    }
}
