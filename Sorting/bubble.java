package Sorting;

import java.util.Arrays;

class bubble{
    public static void main(String[] args) {
        int[] arr= {1,2,11,23,12,2,4,3,45,233,5};
        sort(arr);
        for(int i:arr){
            System.out.print(i+ " ");
        }
        System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr);
        //Arrays.sort(arr, 1, 5) --this sorts the array from the particular indices 1 to 4
        //Arrays.sort(arr, Collections.reverseOrder);

    }

    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){  //the swapping part of the question
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }


        return;
    }
}
