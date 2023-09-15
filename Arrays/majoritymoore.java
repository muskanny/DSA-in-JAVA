package Arrays;

public class majoritymoore {
    
}
/*User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int countcurr=0;
        int count=0;
        int ans=0;
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int j=0; j<size; j++){
            arr.add(a[j]);
        }
        for(int i=0; i<size; i++){
            countcurr=Collections.frequency(arr,arr.get(i));
            if(countcurr>count){
                count=countcurr;
                ans=arr.get(i);
            }
            
        }
        
        if(count>size/2){
            return ans;
        }
        else{
            return -1;
        }
    }
}
*/
/*correct answer: moore's algorithm
 * //{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        int n=size;
        int count=0; 
        int candidate=-1;
        for(int i=0; i<n; i++){
            if(count==0){
                candidate=a[i];
                count=1;
            }
            else{
                if(a[i]==candidate){
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        count=0;
        for(int i=0; i<n; i++){
            if(a[i]==candidate){
                count++;
            }
        }
            if(count>n/2){
                return candidate;
            }
            return -1;
        
    }
}
 */