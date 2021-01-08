// Palindrome Linked List

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
        ListNode cur = head;
        int cnt = 0;
        
        while (cur != null) {
            cur = cur.next;
            cnt++;
        }
        int[] ar = new int[cnt];
        
        cur = head;
        int i = 0;
        while (cur != null) {
            ar[i] = cur.val;
            cur = cur.next;
            i++;
        }
        i = 0;
        int j = cnt - 1;
        
        while (i < j) {
            if (ar[i] != ar[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}