



package Arrays;
import java.util.*;
import java.io.*;
class duplicatepresent {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        
        ArrayList<Integer> ans= new ArrayList<Integer>();
        
        int count=2;
        int candidate=arr[0];
        //int temp=0;
        
        //sorting the array so that my approach works
        
        // Sorting using a single loop
        for (int j = 0; j<n-1; j++) {
 
            // Checking the condition for two
            // simultaneous elements of the array
            if (arr[j] > arr[j + 1]) {
 
                // Swapping the elements.
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
 
                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.
                j = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
        //System.out.println(arr);
        
    
        // code here
        for(int i=0; i<n; i++){

            
         /*    if(count==0){
                System.out.println("our new candidate is "+arr[i]);
               candidate=arr[i];
                count=1;
            }
            */
           
               // System.out.println(arr[i]);
              //  System.out.println(candidate);
                if(arr[i]==candidate){
                count++;
                System.out.println("adding "+arr[i]+" to al");
                if(!ans.contains(arr[i])){
                    ans.add(arr[i]);
                }
                //ans.add(arr[i]);
                System.out.println("added");
                count=0;
                }

                else{
                    count=0;
                    System.out.println("setting new candidate to "+arr[i]);
                    candidate=arr[i];
                    count=1;
                }
            


            

            
            
        }

        
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={7, 6, 8, 4 ,9 ,8, 4, 7, 4, 4};
        ArrayList<Integer> answer=duplicates(arr,10);
        for(int k=0; k<answer.size(); k++){

            System.out.print(answer.get(k));
            System.out.print(" ");

        }
    }
}
