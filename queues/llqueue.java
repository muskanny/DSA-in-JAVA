/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 class Queue{
     Node front;
     Node rear;
     void push(){};
     Queue() {
         front = null;
         rear = null;
     }
 }

 *****************************************************************/

 public class llqueue{

    //Node head=null;
    public void push(int x) {
        // Write Your Code Here
        Node n=new Node(x);
        if(front==null && rear==null){
            front=rear=n;

            return;

        }

        rear.next=n;
        rear=n;
    }

    public int pop() {
        // Write Your Code Here
        if(front==null && rear==null){
            return -1;
        }

        if(front==rear){
            int val=front.data;
            front=rear=null;
            return val;
        }

        int ans=front.data;
        front=front.next;
        return ans;
    }
}