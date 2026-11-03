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
    Stack<TreeNode> s1 = new Stack<>();
    Stack<TreeNode> s2 = new Stack<>();
    public boolean findTarget(TreeNode root, int k) {
        pushLeft(root);
        pushRight(root);
        while (!s1.isEmpty() && !s2.isEmpty() &&
               s1.peek().val < s2.peek().val) {
            TreeNode left = s1.peek();
            TreeNode right = s2.peek();
            int sum = left.val + right.val;
            if (sum == k)
                return true;
            else if (sum < k) {
                TreeNode node = s1.pop();
                pushLeft(node.right);
            }
            else {
                TreeNode node = s2.pop();
                pushRight(node.left);
            }
        }
        return false;
    }
    private void pushLeft(TreeNode root) {
        while (root != null) {
            s1.push(root);
            root = root.left;
        }
    }
    private void pushRight(TreeNode root) {
        while (root != null) {
            s2.push(root);
            root = root.right;
        }
    }
}