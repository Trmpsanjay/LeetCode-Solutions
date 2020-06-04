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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
       // this is for from start;
        
//         // handling edge cases;
        
//         // if n==0 no deletion so return head as it is
//         if(n==0)
//             return head;
//         // if n==1 that means head should be deleted
//         if(n==1)
//             return head.next;
        
//         // creating temporary pointer for traversing
//         ListNode temp = head;
//         int count =0;
//         while(count<n){
//             temp = temp.next;
//             count++;
//         }
//         temp.next =temp.next.next;
//         return head;
        
//     }
        
        
        
        
        
//         // working solution
        
        
//         // handling edge cases;
//         if(n==0)
//             return head;
//          ListNode temp= head;
//         int count=0;
        
//         // counting nodes first
//         while(temp != null){
//             temp = temp.next;
//             count ++;
//         }
//         // handling edge cases
//         if(n==count)
//             return head.next;
//         if(n==0)
//             return head;
//         int c=0;
//         temp = head;
//         while(c<count-n-1){
//             temp = temp.next;
//             c++;
//         }
//         temp.next = temp.next.next;
//         return head;
//     }
        
        
        
        
        
        // trying to solve in one pass
        // copied soln need to understand by dry run
    
    ListNode start = new ListNode(0);
    start.next = head;
    ListNode slow = start, fast = start;
    
    //Move fast in front so that the gap between slow and fast becomes n
    for(int i=1; i<=n+1; i++)   {
        fast = fast.next;
    }
    //Move fast to the end, maintaining the gap
    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
    //Skip the desired node
    slow.next = slow.next.next;
    return start.next;
    }
    
        
}
