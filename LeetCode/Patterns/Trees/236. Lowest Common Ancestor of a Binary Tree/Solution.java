/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode, TreeNode> parent = new HashMap<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findParent(root, null);

        HashSet<TreeNode> set = new HashSet<>();

        while (p != null) {
            set.add(p);
            p = parent.get(p);
        }

        while (q != null) {
            if (set.contains(q)) {
                return q;
            }
            q = parent.get(q);
        }

        return null;
    }

    public void findParent(TreeNode root, TreeNode par) {
        if (root == null) {
            return;
        }

        parent.put(root, par);

        findParent(root.left, root);
        findParent(root.right, root);
    }
}