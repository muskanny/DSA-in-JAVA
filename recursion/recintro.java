package recursion;
import java.util.*;
import java.io.*;
public class recintro {

    //factorial

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    static void recworking(int n){
        if(n==0){
            return;
        }

        System.out.println("ENTERING THE STACK");

        System.out.println(n);
        recworking(n-1);

        System.out.println("EXITTING THE STACK");
        System.out.println(n);
    

    }

    public static void printn(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printn(n-1);

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
        recworking(n);
        printn(10);

        
    }
    
}
