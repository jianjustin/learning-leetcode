public class KthLargest1{
    TreeNode root;
    int k;
    int back;

    public KthLargest1(int k, int[] nums) {
        for (int e : nums) {
            root = dg(root, e);
        }
        this.k = k;
        this.back = k;
    }

    public int add(int val) {
        root=dg(root, val);
        int result = result(root);
        k = back;
        return result;

    }

    public TreeNode dg(TreeNode root, int k) {
        if (root == null) {
            return new TreeNode(k);
        }
        if (root.val >= k) {
            root.count++;
            root.left = dg(root.left, k);
        } else {
            root.count++;
            root.right = dg(root.right, k);
        }
        return root;
    }

    public int result(TreeNode root) {
        int left;
        int right = 0;
        if (root == null || k <= 0) {
            return 0;
        }
        if (root.count < k) {
            k = k - root.count;
            return 0;

        } else {
            right = result(root.right);
            k = k - 1;
        }
        if (k == 0) {
            return root.val;
        }
        left = result(root.left);

        return left+right;
    }

    public static void main(String[] args) {
    }
}

class TreeNode {
    int val;
    int count = 1;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

