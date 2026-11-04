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
    long ans = Long.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        find(root, root.val);

        return ans == Long.MAX_VALUE ? -1 : (int) ans;
    }

    void find(TreeNode root, int min) {
        if (root == null) return;

        if (root.val > min) {
            ans = Math.min(ans, root.val);
            return;
        }

        find(root.left, min);
        find(root.right, min);
    }
}