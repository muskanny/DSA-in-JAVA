package recursion;


public class ropecut{

    static int maxcuts(int n, int a, int b, int c){
        if(n==0){
            return 0;
        }

        if(n<=-1){
            return -1;

        }

        int res= Math.max(maxcuts(n-a, a, b, c),Math.max(maxcuts(n-b, a, b, c),maxcuts(n-c, a, b, c)));

        if(res==-1){
            return -1;
        }

        return res+1;
    }




    public static void main(String[] args) {
        System.out.println(maxcuts(5,3,4,1));
    }
}