package recursion;

public class nat_sum {
    //static int sum=0;
    public static int sumn(int n){
       // if(n==0){
         //   return 0;
        //}
        if(n==1){
            return 1;
        }
        
        return n+sumn(n-1);

    }

    public static void main(String[] args) {
        
        System.out.println(sumn(3));
    }
    
}
