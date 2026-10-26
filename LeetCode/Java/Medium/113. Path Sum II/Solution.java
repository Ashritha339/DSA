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
    public List<List<Integer>> pathSum(TreeNode root,int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        if(root.left==null&&root.right==null){
            if(root.val==targetSum){
                List<Integer> path=new ArrayList<>();
                path.add(root.val);
                ans.add(path);
            }
            return ans;
        }
        List<List<Integer>> left=pathSum(root.left,targetSum-root.val);
        List<List<Integer>> right=pathSum(root.right,targetSum-root.val);
        for(List<Integer> path:left)path.add(0,root.val);
        for(List<Integer> path:right)path.add(0,root.val);
        ans.addAll(left);
        ans.addAll(right);
        return ans;
    }
}
