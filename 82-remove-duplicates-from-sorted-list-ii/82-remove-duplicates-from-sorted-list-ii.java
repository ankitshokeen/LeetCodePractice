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
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        
        ListNode prev = dummyHead;
        
        while (prev.next != null && prev.next.next != null) {
            ListNode curr = prev.next;
            
            if (curr.val == curr.next.val) {
                
                while (prev.next != null && prev.next.val == curr.val) { 
                    prev.next = prev.next.next;
                }
            } else {
                prev = curr;
            }
        }
        return dummyHead.next;
    }
}