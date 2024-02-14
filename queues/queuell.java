/****************************************************************

 Following is the class structure of the Node class:

 static class Node
 {
     int data;
     Node next;
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


 *****************************************************************/
public class queuell {
    static class Stack {
        //Write your code here
        Node head=null;

        Stack()
        {
            //Write your code here
            this.head=null;

        }

        int getSize()
        {
            //Write your code here
            int size=0;
            Node temp=head;
            while(temp!=null){
                size++;
                temp=temp.next;
            }

            return size;
        }

        boolean isEmpty()
        {
            //Write your code here
            return head==null;

        }

        void push(int data)
        {
            //Write your code here
            Node n=new Node(data);
            if(head==null){
                head=n;
                return;
            }

            n.next=head;
            head=n;


        }

        void pop()
        {
            //Write your code here

            if(head==null){
                return;
            }
            
            head=head.next;
            

        }

        int getTop()
        {
            //Write your code here
            if(head==null){
                return -1;
            }
            return head.data;
        }
    }
}

