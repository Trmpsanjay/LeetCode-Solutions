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
    // public static ListNode reverse(ListNode head){
    //     if(head==null || head.next==null)
    //         return head;
    //     ListNode next = head.next;
    //     ListNode answer = reverse(head.next);
    //     next.next = head;
    //     head.next = null;
    //     return answer;
    // }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode tail = null;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int prevCarry = 0;
        int count1 =0;
        int count2=0;
        while(temp1!=null && temp2!=null){
            carry = (temp1.val+temp2.val+prevCarry)/10;
            if(head==null){
                head = tail = temp1;
                if(carry==0){
                    head.val = temp1.val+temp2.val;
                }else{
                    head.val = (temp1.val+temp2.val+prevCarry)%10;
                }
            }else{
                tail.next = temp1;
                tail = tail.next;
                 if(carry==0){
                    tail.val = temp1.val+temp2.val+prevCarry;
                }else{
                    tail.val = (temp1.val+temp2.val+prevCarry)%10;
                }
            }
            prevCarry = carry;
            temp1 = temp1.next;
            temp2 = temp2.next;
            count1++;
            count2++;
        }
        
        if(temp1!=null){
            while(temp1!=null){
                tail.next = temp1;
                tail = tail.next;
                if(carry ==0){
                    break;
                }
                carry = (temp1.val+prevCarry)/10;
                tail.val = (temp1.val+prevCarry)%10;
                prevCarry = carry;
                temp1 = temp1.next;
                count1++;
            }
            if(carry!=0){
                ListNode n = new ListNode(1);
                tail.next = n;
                tail = n;
            }
        }
         if(temp2!=null){
             while(temp2!=null){
                tail.next = temp2;
                tail = tail.next;
                if(carry ==0){
                    break;
                }
                carry = (temp2.val+prevCarry)/10;
                tail.val = (temp2.val+prevCarry)%10;
                prevCarry = carry;
                temp2 = temp2.next;
            }
            if(carry!=0){
                ListNode n = new ListNode(1);
                tail.next = n;
                tail = n;
            }
            count2++;
         }
         if(count1==count2 && carry!=0){
            ListNode n = new ListNode(1);
            tail.next = n;
            tail = n;
        }
        //ListNode ans = reverse(head);
        return head;
        
    }
}
