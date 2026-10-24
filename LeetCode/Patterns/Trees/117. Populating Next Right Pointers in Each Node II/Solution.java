/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)return null;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            ArrayList<Node> al=new ArrayList<>();
            for(int i=0;i<n;i++){
                Node curr=q.peek();
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
                
                al.add(curr);
                q.remove();
            }
            for(int i=0;i<n;i++){
                if(i==n-1){
                    al.get(i).next=null;
                }
              else{ al.get(i).next=al.get(i+1);}
            }
        }
        return root;
    }
}