class Solution {
    public int[] runningSum(int[] nums) {
        //1st attempt
        // int[] runningSum = new int[nums.length];
        
//         int sum = 0;
        
//         for(int i=0; i<nums.length; i++){
//             sum += nums[i];
//             runningSum[i] = sum;
//         }
        
        //2nd approach => O(1) space
        
        int i =1;
        
        while(i < nums.length){
            nums[i] += nums[i-1];
            i++;
        }
        
        return nums;
    }
}