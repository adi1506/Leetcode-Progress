class Solution {
    public int longestConsecutive(int[] nums) {
        //1st attempt : brute force
        if(nums.length == 0)
            return 0;

        
        Arrays.sort(nums);
        int seqCount = 0;
        int maxCons = 0;
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] - nums[i-1] == 1)
                seqCount++;
            else if(nums[i] - nums[i-1] == 0)
                continue;
            else{
                seqCount = 0;
            }
            
            maxCons = Math.max(maxCons,seqCount);
        }
        
        return maxCons + 1;
    }
}