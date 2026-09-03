/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
       ArrayList <Integer> list=new ArrayList<>();
       int ans=Integer.MIN_VALUE;
       ListNode temp=head;
       while(temp!=null){
        list.add(temp.val);
        temp=temp.next;
       } 
       int i=0;
       int j=list.size()-1;
       while(i<j){
        int sum=list.get(i)+list.get(j);
         ans=Math.max(sum,ans);
         i++;
         j--;
       }
       return ans;
    }
}