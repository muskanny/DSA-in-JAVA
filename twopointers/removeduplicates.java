class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (ans.contains(nums[i]) == false) {
                ans.add(nums[i]);
            }
        }
        for (int j = 0; j < ans.size(); j++) {

            nums[j] = ans.get(j);

        }

        return ans.size();
    }
}