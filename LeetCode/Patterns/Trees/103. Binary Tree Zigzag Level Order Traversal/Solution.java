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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        boolean dir=true;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            List<Integer> al=new ArrayList<>();
            int n=q.size();

            for(int i=0;i<n;i++) {
                TreeNode curr=q.poll();
                al.add(curr.val);

                if(curr.left!=null) {
                    q.offer(curr.left);
                }
                if(curr.right!=null) {
                    q.offer(curr.right);
                }
            }

            if(dir==false) {
                Collections.reverse(al);
            }
            ans.add(al);
            dir=!dir;
        }
        return ans;
    }
}