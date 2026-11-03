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
     StringBuilder sb=new StringBuilder();
        List<String> lt=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
       
        if(root==null){
            return lt;
        }
        int n=sb.length();
        if(sb.length()>0){
            sb.append("->");
        }
        sb.append(root.val);
        if(root.left==null&&root.right==null){
             lt.add(sb.toString());
             

        }
        binaryTreePaths(root.left);
        binaryTreePaths(root.right);
        sb.setLength(n);
        
        return lt;
    }}  
    
   

