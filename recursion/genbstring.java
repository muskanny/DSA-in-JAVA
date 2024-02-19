import java.util.List;
import java.io.*;
import java.util.*;
public class genbstring {
    public static List< String > generateString(int N) {
        // Write your code here.
        List<String> ans = new ArrayList<>();
        String str="";
        int cl=0;
        ans=helper(cl,N,str,ans);
        return ans;
    }

    public static List<String> helper(int cl, int N, String str, List<String> ans){
        if(cl==N){
            ans.add(str);
            return ans;
        }
        helper(cl+1,N,str+'0',ans);
        if(str.length()==0 || str.charAt(cl-1)!='1'){
            helper(cl+1,N,str+'1',ans);
        }

        return ans;
    }
}
