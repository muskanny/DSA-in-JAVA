package Linked_Lists;
import java.util.*;
import java.io.*;

//insertion at the end
//check if the ll is empty, in that case head ko bhi point karao
//1: the concept will be to first create the node which i want to insert at the end
//-currently the node points to null
//2: it will keep pointing to null
//3: then i have to make changes in the previous node by-
//a: changing the prev node's next pointer to this new node instead of null
//head is like reference 
//similar to pointers
class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}

public class insertion_end{

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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        head=insertEnd(head, 10);
        head=insertEnd(head, 12);
        head=insertEnd(head, 14);

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
}