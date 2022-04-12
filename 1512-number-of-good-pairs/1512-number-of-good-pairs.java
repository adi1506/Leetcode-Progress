class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        //1st attempt: brute force
        int gp = 0;
        // for(int i =0; i<nums.length;i++){
        //     for(int j=i+1; j<nums.length;j++){
        //         if(nums[i] == nums[j]){
        //             gp++;
        //         }
        //     }
        // }
        
        //2nd attemt : counting number of digits and then calculating good pairs
        
        int[] arr = new int[101];
        for(int ctr : nums){
            arr[ctr]++;
        }
        for(int ctr : arr){
            gp += ctr*(ctr-1)/2;
        }
        return gp;
    }
}