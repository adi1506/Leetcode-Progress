class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        
        //1st Attempt (correct answer but can be optimised)
        
        // for(int i = 0; i < ans.length; i++){
        //     ans[i] = nums[i%nums.length];
        // }
        
        //Optimised solution to cut down the number of iterations
        
        for(int i =0; i< nums.length; i++){
            ans[i] = ans[nums.length + i] = nums[i];
        }
        return ans;
        
    }
}