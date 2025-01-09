package recursion;
import java.util.*;
public class gen_subseq {
    public static void main(String[] args) {
        int arr[]={1,4,2,5,3};
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> sub=new ArrayList<>();
        ans=helper(arr,0, sub, ans);
        System.out.println(ans);

    }
    
    public static ArrayList<ArrayList<Integer>> helper(int[] arr, int curr, ArrayList<Integer> sub, ArrayList<ArrayList<Integer>> ans){

        if(curr==arr.length){
            ans.add(new ArrayList<>(sub));
            return ans;
        }

        sub.add(arr[curr]);
        helper(arr, curr+1, sub, ans);
        sub.remove(sub.size()-1);
        helper(arr, curr+1, sub, ans);


        return ans;

    }
}


