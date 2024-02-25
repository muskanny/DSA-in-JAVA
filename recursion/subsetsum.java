
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class subsetsum {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(sc.nextInt());
            }
            Solution ob = new Solution();

            ArrayList<Integer> ans = ob.subsetSums(arr, N);
            Collections.sort(ans);
            for (int sum : ans) {
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends

// User function Template for Java//User function Template for Java
class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> subans = new ArrayList<>();
        int index = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        subsets(arr, N, index, ans, subans);
        for (int i = 0; i < ans.size(); i++) {
            int subsum = 0;
            for (int j = 0; j < ans.get(i).size(); j++) {
                subsum += ans.get(i).get(j);
            }
            answer.add(subsum);

        }
        return answer;
    }

    public void subsets(ArrayList<Integer> arr, int N, int index, ArrayList<ArrayList<Integer>> ans,
            ArrayList<Integer> subans) {
        if (index == N) {
            ans.add(new ArrayList<Integer>(subans));
            return;
        }

        subans.add(arr.get(index));
        subsets(arr, N, index + 1, ans, subans);
        subans.remove(subans.size() - 1);
        subsets(arr, N, index + 1, ans, subans);
        return;
    }
}