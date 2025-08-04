class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDep = maxDepth(root.left);
        int rightDep = maxDepth(root.right);
        return Math.max(leftDep, rightDep) + 1;
    }

    // For testing
    public static void main(String[] args) {
        // Build sample tree: 
        //      1
        //     / \
        //    2   3
        //   /
        //  4
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        Solution sol = new Solution();
        int depth = sol.maxDepth(root);
        System.out.println("Max Depth: " + depth); // Expected: 3
    }
}
