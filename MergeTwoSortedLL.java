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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // handling edge edge cases
        // if only list 2 exists return list 2
        if(l1==null)
            return l2;
        // if only list 1 exists return list 1
        if(l2==null)
            return l1;
        // if no list exists return null
        if(l1==null && l2 == null)
            return null;
        // creating two pointers to keep track new sorted linked list
        ListNode head = null;
        ListNode tail = null;
        
        while(l1 != null && l2 != null){
            if(l1.val<l2.val){
                if(head == null)
                    head = tail = l1;
                else{
                    tail.next = l1;
                    tail = l1;
                }
                l1= l1.next;
            }
            else{
                if(head == null)
                    head = tail = l2;
                else{
                    tail.next = l2;
                    tail = l2;
                }
                l2 = l2.next;
            }
        }
        
        // now checking adding the remaining l1 or l2 list;
        // making tail .next = null
        if(tail!=null)
        tail.next = null;
        if(l1!=null)
            tail.next = l1;
        if(l2 != null)
            tail.next = l2;
        return head;
        
        
        
    }
}
