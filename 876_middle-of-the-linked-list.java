class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;

        // Step 1: Count total nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Step 2: Calculate middle index (second middle in case of even count)
        int mid = count / 2;

        // Step 3: Traverse again to the middle node
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        return temp;
    }
}
