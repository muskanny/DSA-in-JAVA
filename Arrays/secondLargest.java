import java.util.Arrays;

public class secondLargest {

    public static void main(String[] args) {
        int a[] = { 1, 3, 2, 4, 5 };
        int n = a.length;
        int[] ans = getSecondOrderElements(n, a);
        for (int i = 0; i < 2; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] getSecondOrderElements(int n, int[] arr) {
        // Write your code here.

        // this is approach 1 which will be of the order=nlogn
        /*
         * Arrays.sort(a);
         * int ans[]=new int[2];
         * ans[0]=a[n-2];
         * ans[1]=a[1];
         * 
         * return ans;
         * 
         */

        // optimising it

        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }

        int ans[] = { secondlargest, secondsmallest };
        return ans;
    }

}
