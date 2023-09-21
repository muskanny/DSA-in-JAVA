package stacks;
class node{
    int data;
    node next;
    node(int val){

        next=null;
        data=val;

    }
}

class myStack
{
    node head;
    int sz;
    myStack(){
        head=null;
        sz=0;

    }

    int size(){
        return sz;

    }

    boolean isEmpty(){

        return (head==null);

    }

    void push(int x){
        node temp=new node(x);
        temp.next=head;
        head=temp;
        sz++;
    }

    int pop(){
        if(head==null){
            System.out.println("the stack is empty");
            return -1;

        }

        int y=head.data;
        head=head.next;
        sz--;
        return y;

    }

    int peek(){
        if(head==null){
            System.out.println("the stack is empty");
            return -1;
        }

        else{
            return head.data;
        }
    }

    void print(){
       node temp=head;
       while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
       }
    }

}

public class llstack {
    public static void main(String[] args) {
        myStack s=new  myStack();
        s.push(3);
        s.push(7);
        s.push(11);
        s.push(13);
        s.push(22);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        s.print();

    }

    
}
