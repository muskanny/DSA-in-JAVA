package Arrays;

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class maxindexdifference {

    public static void main(String[] args) throws IOException {
        int arr[] = { 11, 2, 3, 45, 49 };

        System.out.println(maxIndexDiff(arr, 5));
    }

    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.

    static int maxIndexDiff(int A[], int N) {

        // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();

        int end = N - 1;

        int max = 0;
        while (end > 0) {
            int start = 0;
            while (start < end) {
                if (A[start] <= A[end]) {
                    ans.add(end - start);
                    break;
                }
                start++;

            }

            // System.out.println("onto the next iteration");

            end--;
        }
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i) > max) {
                max = ans.get(i);
            }
        }
        return max;
    }

}
