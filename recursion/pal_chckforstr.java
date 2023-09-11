package recursion;

public class pal_chckforstr {

    public static boolean palstr(String a, int start, int end){

        if(start>=end){
            return true;
        }

        return (a.charAt(start)==a.charAt(end))&&palstr(a,start+1,end-1);

    }

    public static void main(String[] args) {

        System.out.println("string abab "+ palstr("abab", 0, 3));
        System.out.println("string abba "+ palstr("abba", 0, 3));
        
    }
    
}
