package recursion;

public class 2perfectsubstsum {
    

class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subans=new ArrayList<>();
        //int currsum=0;
        helper(nums, 0, subans, ans, target);
        return ans.size();

    }
        void helper(int[] nums,int curr,List<Integer> subans,List<List<Integer>> ans, int target){
            if(curr==nums.length){
                int sum=0;
                for(int i:subans){
                    sum+=i;
                }
                if(sum==target){
                    ans.add(new ArrayList<>(subans));
                    return;
                }
                else{
                    return;
                }
            }
            
            subans.add(nums[curr]);
            helper(nums, curr+1, subans, ans, target);
            subans.remove(subans.size()-1);
            helper(nums, curr+1, subans, ans, target);
            
            return;
            
        }
}
}
