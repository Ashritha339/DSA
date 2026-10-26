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
    public List<List<Integer>> levelOrder(TreeNode root) {
      
      List<List<Integer>> ans=new ArrayList<>();
      if(root==null)return ans;
      Queue<TreeNode> q=new LinkedList<>();
      q.offer(root);
      while(!q.isEmpty()){
        int n=q.size();
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            TreeNode curr=q.poll();
            if(curr.left!=null){
                q.offer(curr.left);
            }
            if(curr.right!=null){
                q.offer(curr.right);
            }
            al.add(curr.val);

        }
        ans.add(al);
      }  
      return ans;
    }
}