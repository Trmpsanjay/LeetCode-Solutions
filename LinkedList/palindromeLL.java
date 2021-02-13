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
    
     public ListNode reverseList(ListNode head) {
        //base case
        if(head==null || head.next==null)
            return head;
        ListNode next = head.next;
       ListNode finalNode = reverseList(head.next);
        next.next = head;
        head.next = null;
        return finalNode;
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow,fast;
        slow = fast = head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
        ListNode mid = middleNode(head);
        mid.next = reverseList(mid.next);
        mid = mid.next;
        ListNode temp = head;
        while(mid!=null){
            if(temp.val!=mid.val)
                return false;
            mid = mid.next;
            temp = temp.next;
        }
        return true;
    }
}
