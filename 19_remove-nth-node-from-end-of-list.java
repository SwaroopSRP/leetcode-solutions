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
        ListNode dum = new ListNode(-1); // for edge cases
        dum.next = head;

        ListNode slow = dum;
        ListNode fast = dum;

        for (int i = 0; i <= n; i++) { // move n nodes
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        } // slow now points to prev to target node

        slow.next = slow.next.next; // delinked the target node

        return dum.next;
    }
}
