class 3sum {
    public List<List<Integer>> threeSum(int[] nums) {
       //ideally this would have been an o(n^3) problem 
       Arrays.sort(nums);
       List<List<Integer>> ans=new ArrayList<>();
       for(int i=0; i<nums.length-2; i++){
           if(i==0|| (i>0 && nums[i]!=nums[i-1])){
               int low=i+1; 
               int high=nums.length-1;
               int sum=0-nums[i];
               while(low<high){
                   if(nums[low]+nums[high]==sum){
                       ans.add(Arrays.asList(nums[i],nums[low],nums[high]));
                       while(low<high && nums[low]==nums[low+1]){
                           low++;
                       }

                       while(low<high && nums[high]==nums[high-1]){
                           high--;
                       }

                       low++;
                       high--;
                   }
                   else if(nums[low] +nums[high]<sum){
                       low++;
                   }
                   else{
                       high--;
                   }
               }

           }

           
       }
        return ans;
    }

}