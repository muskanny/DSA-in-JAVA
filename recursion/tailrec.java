package recursion;

public class tailrec {

    public static int fibo(int n)
    {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);

    }


    public static void main(String[] args) {
        //in the recintro we talked about printing from n to 1 and 1to n respectively
        //isme printnowill take less time on modern compilers because it is tail recursive

        System.out.println(fibo(4));


        
    }
    
}
