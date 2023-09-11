package recursion;
import java.util.*;
import java.io.*;
public class pal_check {

    public static String pall(int n){

        if(n==0){
            return "";
        }



        int m= n%10;

        return Integer.toString(m)+pall(n/10);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to get checked ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("it is a pallindrome only, not entering the check");
            return;

        }

        if(Integer.valueOf(pall(n))==n){
            System.out.println("it is a pallindrome number");
        }
        else{
            System.out.println("it is not pallindrome");
        }
        
    }
    

}
