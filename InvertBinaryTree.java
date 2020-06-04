/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // here we have access of only the node which is to be deleted 
        //so we will copy the value of next node in given node and we will delete next node;
        //copying next node value;
        node.val=node.next.val;
        //deleting next node;
        node.next=node.next.next;
        
    }
}
