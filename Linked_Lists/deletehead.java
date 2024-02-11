/****************************************************************
 * 
 * Following is the linkedList class structure:
 * 
 * class Node
 * {
 * public int data;
 * public Node next;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * }
 * 
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * 
 * Node(int data, Node next)
 * {
 * this.data = data;
 * this.next = next;
 * }
 * }
 * 
 *****************************************************************/

public class deletehead {
    public static Node deleteHead(Node head) {
        // Write Your Code Here.
        if (head.next == null) {
            return null;
        }
        head = head.next;
        return head;
    }
}