package Linked_Lists;
import java.util.*;
import java.io.*;

//insertion at the given postion
//will have to check if like elements must be present before that
//basically i cant insert at 5th postion if there are 2 positions only
//1: the concept will be to first create the node which i want to insert at the end
//-currently the node points to null
//2: it will keep pointing to null
//3: then i have to make changes in the previous node by-

//a: changing my new node's next to the previous node's next instead of null
//b: changing the prev node's next pointer to this new node
class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}

public class insertion_at_pos{

    static Node insert_at_pos(Node head,int pos, int x){


        Node nx=new Node(x);  //creation of new node pointing to null
        if(head==null){
            if(pos==0){
                nx.next=null;
                head=nx;
            }
            else{
                System.out.println("elements before not present");
            }
        }
        else{
            Node temp=head;
            int i=0;
            if(pos==0){
                nx.next=head.next;
                head=nx;
                return head;
            }
            for(i=0; i<pos; i++){
                
                temp=temp.next;
                i++;

            }
            if(temp==null){
                System.out.println("position not found");
                return head;
            }
            else{
            nx.next=temp.next;
            temp.next=nx;
            }
        }

        return head;

        
    }

        
        
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        head=insertBegin(head, 1);
        head=insertEnd(head, 2);
        head=insertEnd(head, 3);
        head=insertEnd(head, 4);
        head=insert_at_pos(head, 0, 12);

        System.out.println("do you want to see the elements inside?");
        String op=sc.nextLine();
        if(op.equals("yes")){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data);
                System.out.print(" ");
                temp=temp.next;
            }
        }

        
    }

    public static Node insertEnd(Node head, int x){


        Node nx=new Node(x);  //creation of new node pointing to null
        if(head==null){
            head=nx;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;

            }
            temp.next=nx;

        }

        return head;
        
        
    }

    public static Node insertBegin(Node head, int x){
        Node nx=new Node(x);  //creation of new node pointing to null
        nx.next=head; //making it point to head
        head=nx; //updating head
        return head;
    }





}