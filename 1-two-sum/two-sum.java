class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int[] ans = new int[2]; // 0 0
        
        for(int i=0; i<nums.length-1; i++){
            
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        
        
        return ans;
    }
}