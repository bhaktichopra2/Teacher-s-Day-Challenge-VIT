public class RemoveLinkedListElements {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode current = dummy;
            while (current.next != null) {
                if (current.next.val == val)
                    current.next = current.next.next;
                else
                    current = current.next;
            }
            return dummy.next;
        }
    }

    static void printList(ListNode head) {
        for (ListNode curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Manually build the list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.print("Original: ");
        printList(head);

        Solution sol = new Solution();
        ListNode result = sol.removeElements(head, 6);

        System.out.print("After removing 6: ");
        printList(result);
    }
}
