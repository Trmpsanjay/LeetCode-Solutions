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
    public ListNode deleteDuplicates(ListNode head) {
       //handling edge cases
        if(head==null)
            return null;
        // creating temp variabe to keep track
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.val== temp.next.val)
                temp.next=temp.next.next;
            else
                temp = temp.next;
        }
        return head;
        
    }
}
