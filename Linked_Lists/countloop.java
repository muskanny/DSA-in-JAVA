class countloop
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        
        Node slow=head;
        Node fast=head;
        
        int count=1;
        while(fast!=null){
            slow=slow.next;
            if(fast.next==null){
                return 0;
            }
            
            fast=fast.next.next;
            if(slow==fast){
                slow=slow.next;
                while(slow!=fast){
                    count++;
                    slow=slow.next;
                }
                return count;
            }
        }
        return 0;

        
    }
}