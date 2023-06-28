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
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode curr = dummyHead;
        
        ListNode sz = head;
        int size = 0;
        while (sz != null) {
            sz = sz.next;
            size++;
        }
        
        if (size == 1 && head.next == null) {
            return null;
        }
        
        if (size == n) {
            head = head.next;
            return head;
        }
        
        int pos = size-n;
        
        while (pos != 0) {
            curr = curr.next;
            pos--;
        }
        curr.next = curr.next.next;
        
        return dummyHead.next;
    }
}