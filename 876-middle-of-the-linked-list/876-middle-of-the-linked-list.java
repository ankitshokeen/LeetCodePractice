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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode slow = head;
        ListNode fast = head;
        ListNode s = head;
        
        while (s != null) {
            s = s.next;
            size++;
        }
        
        if (size % 2 != 0) {
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        }
        
        if (size % 2 == 0) {
            while (fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
        }
        
        return null;
    }
}