class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lf = new ListNode(0), temp;
        ListNode lfTail = lf;

        int sum, d1, d2;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) { // add till last carry
            d1 = (l1 == null) ? 0 : l1.val;
            d2 = (l2 == null) ? 0 : l2.val;

            sum = d1 + d2 + carry;
            carry = sum / 10;

            temp = new ListNode(sum % 10);
            lfTail.next = temp;
            lfTail = lfTail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        lf = lf.next;

        return lf;
    }
}
