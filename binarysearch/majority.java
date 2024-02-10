public class majority {
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        //to count the occurence- first and last occurence can be calculated
        int lastocc=rightocc(arr, n, x);
        int firstocc=leftocc(arr, n, x);

        if(lastocc==-1 || firstocc==-1){
            return 0;
        }

        return lastocc-firstocc+1;

    }

    public static int leftocc(int arr[], int n, int x){
        int ans=-1;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]>x){

                end=mid-1;

            }
            else{
                start=mid+1;
            }

        }

        return ans;
    }


    public static int rightocc(int arr[], int n, int x){
        int ans=-1;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]>x){

                end=mid-1;

            }
            else{
                start=mid+1;
            }

        }

        return ans;
    }
}