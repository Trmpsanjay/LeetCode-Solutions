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
    public static int count(ListNode node){
        int count =0;
        while(node!=null){
            count++;
            node = node.next;
        }
        return count;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k==1)
            return head;
            
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode curr = dummy,nextMine = dummy ,prev = dummy;
            int count = count(head);
            while(count>=k){
                curr = prev.next;
                nextMine = curr.next;
                for(int i=1; i < k; i++){
                    curr.next = nextMine.next;
                    nextMine.next = prev.next;
                    prev.next = nextMine;
                    nextMine = curr.next;
                }
                prev = curr;
                count = count-k;
                
            }
            return dummy.next;
        
    }
}
