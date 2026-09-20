class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next; // save next node
            current.next = prev;          // reverse the link

            prev = current;               // move prev forward
            current = next;               // move current forward
        }

        return prev;
    }
}