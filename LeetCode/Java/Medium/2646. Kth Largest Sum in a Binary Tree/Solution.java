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
class Solution{
    public long kthLargestLevelSum(TreeNode root,int k){
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Long> al=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            long sum=0;
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                sum+=curr.val;
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            al.add(sum);
        }
        if(al.size()<k)return -1;
        Collections.sort(al);
        Collections.reverse(al);
        return al.get(k-1);
    }
}