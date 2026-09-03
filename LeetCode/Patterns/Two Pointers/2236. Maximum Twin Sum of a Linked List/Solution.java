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
       ListNode prev=null;
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null&&fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
       }
       ListNode curr=slow;
       while(curr!=null){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;


       }
       ListNode temp=head;
       ListNode last=prev;
       int max=0;
       while(last!=null){
        max=Math.max(temp.val+last.val,max);
        temp=temp.next;
        last=last.next;
       }
       return max;
    }
}