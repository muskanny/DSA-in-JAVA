package bitwise_operators;

public class pt1 {
    
    public static void main(String[] args) {
        // bitwise and &-- AND operator
        int x=5;
        int y=6;
        System.out.println(x&y);

        //bitwise or operator || 
        System.out.println(x|y);

        //bitwise xor operator- ^
        //diff bits 1 same 0
        System.out.println(x^y);

        //bitwise not operator ~
        //inverts all the bits in the binary representation
        System.out.println(~x); // -x=2**32-x   ~x=2**32-1-


        //bitwise operator leftshift
        //shiftsb inary representation leftside with given number of positions
        
    }
    
}
