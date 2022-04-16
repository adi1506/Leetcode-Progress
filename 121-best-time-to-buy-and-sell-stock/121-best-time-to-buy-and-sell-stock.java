class Solution {
    public int maxProfit(int[] nums) {
        
//         //1st attempt : brute force
//         // TC : O(N^2) : time limit exceeded
//         int profit =0;
                
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i; j< nums.length; j++){
//                 if(nums[j] - nums[i] > profit)
//                     profit = nums[j] - nums[i];
//             }
//         }
        
//         return profit;
        int min = nums[0];
        int profit = 0;
        
        for(int i = 0; i<nums.length; i++){
            if(min > nums[i])
                min = nums[i];
            if(nums[i] - min > profit)
                profit = nums[i] - min;
        }
        return profit;
    }
}