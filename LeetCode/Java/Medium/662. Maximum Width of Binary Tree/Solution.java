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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)return 0;

        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int ans=0;

        while(!q.isEmpty()){
            int n=q.size();
            int min=q.peek().idx;
            int first=0,last=0;

            for(int i=0;i<n;i++){
                Pair p=q.poll();
                TreeNode curr=p.node;
                int idx=p.idx-min;

                if(i==0)first=idx;
                if(i==n-1)last=idx;

                if(curr.left!=null)
                    q.add(new Pair(curr.left,2*idx+1));
                if(curr.right!=null)
                    q.add(new Pair(curr.right,2*idx+2));
            }

            ans=Math.max(ans,last-first+1);
        }

        return ans;
    }

    class Pair {
        TreeNode node;
        int idx;

        Pair(TreeNode node,int idx){
            this.node=node;
            this.idx=idx;
        }
    }
}