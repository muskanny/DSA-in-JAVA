import java.util.Arrays;

public class secondLargest {

    public static void main(String[] args) {
        int a[]={1,3,2,4,5};
        int n=a.length;
        System.out.println(getSecondOrderElements(n, a));
    }

    
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.

        //this is approach 1 which will be of the order=nlogn
        /* 
        Arrays.sort(a);
        int ans[]=new int[2];
        ans[0]=a[n-2];
        ans[1]=a[1];

        return ans;

        */

        //optimising it

        int largest=arr[0];
        int secondlargest=arr[0];
        int smallest=arr[0];
        int secondsmallest=arr[0];

        for(int i=1; i<n; i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            if(arr[i]<smallest){
                secondsmallest=smallest;
                smallest=arr[i];
            }
        }

        int ans[]={secondlargest,secondsmallest};
        return ans;
    }

    
}
