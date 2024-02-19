//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class powset {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // input string
            String st = sc.next();

            // calling powerSet() function
            ArrayList<String> ans = new LexSort().powerSet(st);

            // sorting the result of the powerSet() function
            Collections.sort(ans);

            // printing the result
            for (String s : ans)
                System.out.print(s + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends
// User function Template for Java

class LexSort {
    // Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String s) {
        // add your code here
        ArrayList<String> ans = new ArrayList<>();
        String curr = "";
        int idx = 0;
        return answer(s, ans, curr, idx);

    }

    static ArrayList<String> answer(String s, ArrayList<String> ans, String curr, int idx) {
        if (idx == s.length()) {
            ans.add(curr);
            return ans;
        }

        answer(s, ans, curr, idx + 1);
        answer(s, ans, curr + s.charAt(idx), idx + 1);

        return ans;
    }

}
/*
 * //User function Template for Java
 * 
 * 
 * class LexSort
 * {
 * //Function to return the lexicographically sorted power-set of the string.
 * static ArrayList<String> powerSet(String s)
 * {
 * 
 * ArrayList<String> ans=new ArrayList<String>();
 * int index=0;
 * String curr="";
 * return powset(s,index,curr, ans);
 * // add your code here
 * 
 * 
 * 
 * 
 * }
 * static ArrayList<String> powset(String s,int index, String curr,
 * ArrayList<String> ans){
 * 
 * if(index==s.length()){
 * 
 * ans.add(curr);
 * return ans;
 * 
 * }
 * 
 * powset(s, index+1, curr+s.charAt(index), ans);
 * powset(s,index+1, curr, ans);
 * 
 * 
 * 
 * return ans;
 * 
 * }
 * }
 * 
 * 
 */

// { Driver Code Starts.

// } Driver Code Ends