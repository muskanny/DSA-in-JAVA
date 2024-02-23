/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class delnfromend {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (length == n) {
            head = head.next;
            return head;
        }

        temp = head;
        while ((length - n - 1) > 0) {
            if (temp == null) {
                return null;
            }
            temp = temp.next;
            length--;

        }

        if (temp.next == null) {
            return null;
        }
        if (temp.next.next == null) {
            temp.next = null;
            return head;
        }
        temp.next = temp.next.next;
        return head;

    }
}