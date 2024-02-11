public class insertinmiddle {
    public Node insertInMid(Node head, int data) {
        // Insert code here, return the head of modified linked list
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;

        }
        if (count % 2 == 0) {
            count = count / 2;
            Node curr = head;
            while (count > 1) {
                count--;
                curr = curr.next;

            }
            Node n = new Node(data);
            n.next = curr.next;
            curr.next = n;

            return head;

        }

        else {
            count = (count / 2) + 1;
            Node curr = head;
            while (count > 1) {
                count--;
                curr = curr.next;
            }
            Node n = new Node(data);
            n.next = curr.next;
            curr.next = n;
            return head;
        }
    }
}
