class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;  // will track position to place non-val elements
        
        // iterate through array
        for (int j = 0; j < nums.length; j++) {
            // if current element is not val, copy it to position i
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        
        return i;  // i represents the new length
    }
}