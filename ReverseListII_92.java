public class ReverseListII_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Step 1: move prev to node before "left"
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // Step 2: reverse from left to right
        ListNode curr = prev.next;
        ListNode next = null;
        ListNode lastUnchanged = prev;   // node before sublist
        ListNode tailOfSublist = curr;   // will become tail after reversal

        for (int i = left; i <= right; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: reconnect
        lastUnchanged.next = prev;       // new head of reversed sublist
        tailOfSublist.next = curr;       // connect tail to remainder

        return dummy.next;
    }
}
