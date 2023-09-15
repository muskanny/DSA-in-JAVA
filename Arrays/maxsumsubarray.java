package Arrays;
public class maxsumsubarray {
    static long sum=0;
    static long sumtemp=0;

    static long maxSubarraySum(int arr[], int n){
        //making subsets
        long max_ending_here=Integer.MIN_VALUE;
        long max_so_far=Integer.MIN_VALUE;
        
        for(int num: arr){
            
            max_ending_here=Math.max(num, max_ending_here+num);
            max_so_far=Math.max(max_ending_here, max_so_far);

        }
        


        return max_so_far;
    }

        public static void main(String[] args) {
        int arr[]={1,2,3,-2,5};
        System.out.println(maxSubarraySum(arr, 5));
        
    
}


        
}
