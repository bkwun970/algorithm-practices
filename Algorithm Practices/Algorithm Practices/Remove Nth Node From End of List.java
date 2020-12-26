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
        ListNode cur = head;
        int cnt = 0;
        while (cur != null) {
            cnt++;
            cur = cur.next;
        }
        return helper(head, (cnt - n));
    }
    private ListNode helper(ListNode head, int cnt) {
        if (head == null) {
            return null;
        } else if (cnt == 0) {
            return head.next;
        } else {
            head.next = helper(head.next, cnt - 1);
            return head;
        }
    }
}