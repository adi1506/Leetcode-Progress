class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //1st attempt : brute force   
        
//         int[] res = new int[nums.length];
        
//         for(int i = 0; i<nums.length; i++){
//             for(int j = 0; j<nums.length; j++){
//                 if(nums[i]>nums[j]){
//                     res[i]++;
//                 }
//             }
//         }
        //2nd attempt :- optimised, using count sort
        int[] count = new int[101];
        int[] res = new int[nums.length];
        
        for(int ctr : nums){
            count[ctr]++;
        }
        
        for(int i =1; i<count.length; i++){
            count[i] += count[i-1];
        }
        
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }
        
        return res;
    }
}