import java.util.ArrayList;
import java.util.List;

/**
 * 二叉查找树 - 基本实现
 */
public class BinarySearchTree {

    /**
     * 二叉搜索树插入节点
     * @param root
     * @param element
     * @return
     */
    public TreeNode InsertBST(TreeNode root , int element){
        if (null == root){
            root = new TreeNode(element);
        }else{
            if(root.val > element)
                root.left = InsertBST(root.left,element);
            else if (root.val < element)
                root.right = InsertBST(root.right,element);
        }
        return root;
    }

    /**
     * 根据数组构建二叉搜索树
     * @param values
     * @return
     */
    public TreeNode buildBST(int[] values){
        TreeNode root = null;
        for (int value : values)
            root = InsertBST(root,value);
        return root;
    }

    /**
     * 二叉搜索树 - 中序遍历
     * @param root
     * @param values
     */
    public void traverseBST(TreeNode root , List<Integer> values){
        if (null == root)return;
        traverseBST(root.left,values);
        System.out.print(root.val+",");
        values.add(root.val);
        traverseBST(root.right,values);
    }

    /**
     * 删除二叉搜索树 - 查找指定元素
     * @param root
     * @param key
     * @return
     */
    public boolean removeBST(TreeNode root , int key){
        if (null == root) {
            return false;
        }else {
            if (root.val == key)
                return removeBST(root);
            else if (root.val > key)
                return removeBST(root.left, key);
            else
                return removeBST(root.right, key);
        }
    }

    /**
     * 删除二叉搜索树 - 删除指定元素
     * @param keyNode
     * @return
     */
    public boolean removeBST(TreeNode keyNode){
        if (null == keyNode.left && keyNode.right == null) {
            keyNode = null;
        }else if (null == keyNode.right){
            keyNode = keyNode.left;
            keyNode.left = null;
        }else if (null == keyNode.left){
            keyNode = keyNode.right;
            keyNode.right = null;
        }else {
            TreeNode q = keyNode , s = keyNode.left;
            while (null != s.right){
                q = s;
                s = s.right;
            }
            keyNode.val = s.val;
            if (keyNode.val != q.val)
                q.right = s.right;
            else
                q.left = s.right;
            s = null;
        }
        return true;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        int[] nums = {3,1,4,2,8,6};
        TreeNode root = tree.buildBST(nums);
        tree.traverseBST(root,new ArrayList<Integer>());
        tree.removeBST(root,3);
        tree.traverseBST(root,new ArrayList<Integer>());
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
