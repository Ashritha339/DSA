/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;

    public int findTilt(TreeNode root) {
        sum(root);
        return ans;
    }

    int sum(TreeNode root) {
        if (root == null) return 0;

        int left = sum(root.left);
        int right = sum(root.right);

        ans += Math.abs(left - right);

        return root.val + left + right;
    }
}