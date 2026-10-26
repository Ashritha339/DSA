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
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        return countFrom(root, targetSum)
             + pathSum(root.left, targetSum)
             + pathSum(root.right, targetSum);
    }

    public int countFrom(TreeNode root, long targetSum) {
        if (root == null) {
            return 0;
        }

        int ans = 0;

        if (root.val == targetSum) {
            ans++;
        }

        ans += countFrom(root.left, targetSum - root.val);
        ans += countFrom(root.right, targetSum - root.val);

        return ans;
    }
}


