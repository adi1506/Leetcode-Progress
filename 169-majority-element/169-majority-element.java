class Solution {
    public int majorityElement(int[] nums) {
        //1st attempt : brute force : TC : O(n^2) ; SC : O(1)
        int n = nums.length;
        int prev = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != prev){
                for(int j = 0; j< n; j++){
                    if(nums[j] == nums[i])
                        count++;
                }    
            }
            prev = nums[i];
            if(count > n/2)
                return nums[i];
            else
                count = 0;
        }
        return 0;
    }
}