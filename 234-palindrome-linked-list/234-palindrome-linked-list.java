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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int size = 1;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        
        int[] arr = new int[size];
        for (int i=0; i<=size; i++) {
            arr[i] = head.val;
            if (head.next == null) {
                break;
            }
            head = head.next;
        }

        int i = 0;
        int j = size -1;
        while (i <= j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else if (arr[i] != arr[j]) {
                return false;
            }
        }
        
        return true;
    }
}