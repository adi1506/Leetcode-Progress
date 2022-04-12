class Solution {
    public int[] buildArray(int[] nums) {
        //Brute force approach without O(1) space complexity
        // int[] ans = new int[nums.length];
        // for(int i=0; i< nums.length; i++){
        //     ans[i] = nums[nums[i]];
        // }
        // return ans;
        
        
        //To achieve O(1) space complexity
        int n = nums.length;
        
        for(int i = 0; i<n; i++){
            nums[i] = nums[i] + n*(nums[nums[i]] % n);
            
        }
        
        for(int i = 0; i <n; i++){
            nums[i] /= n;
        }
        
        return nums;
    }
}