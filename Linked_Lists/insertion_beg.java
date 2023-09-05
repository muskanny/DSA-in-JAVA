package Linked_Lists;
import java.util.*;
import java.io.*;

//insertion at the beginning
//1: the concept will be to first create the node which i want to insert at the beginn
//-currently the node points to null
//2: now i have to make it point to the head
//3: then i have to make it the head
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

public class insertion_beg{

    static Node insertBegin(Node head, int x){
        Node nx=new Node(x);  //creation of new node pointing to null
        nx.next=head; //making it point to head
        head=nx; //updating head
        return head;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node head=null;
        head=insertBegin(head,10);
        head=insertBegin(head,12);
        head=insertBegin(head,14);

        System.out.println("do you want to see the elements inside?");
        String op=sc.nextLine();
        if(op.equals("yes")){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        
    }
}