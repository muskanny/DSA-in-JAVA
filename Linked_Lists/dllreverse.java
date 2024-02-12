/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

 public class dllreverse
 {
     public static Node reverseDLL(Node head)
     {
         // Write your code here.
         Node curr=head;
         Node p=null;
         Node n=null;
 
         while(curr.next!=null){
             n=curr.next;
             curr.next=p;
             curr.prev=n;
             p=curr;
             curr=curr.prev;
 
 
 
         }
         curr.next=curr.prev;
         curr.prev=null;
         return curr;
 
 
 
 
     }
 }