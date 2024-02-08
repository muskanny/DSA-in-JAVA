public class sortedandrotated {
    public boolean check(int[] arr) {
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                count++;
            }
        }

        if(count==0 || count==1 && arr[0]>=arr[arr.length-1]){
            return true;
        }

        else{
            return false;
        }
    }
    
}
