class Solution {
    public int longestConsecutive(int[] nums) {
        //1st attempt : brute force
        // TC : O(nlogn + n)
        // SC : O(1)
//         if(nums.length == 0)
//             return 0;

        
//         Arrays.sort(nums);
//         int seqCount = 0;
//         int maxCons = 0;
//         for(int i = 1 ; i < nums.length; i++){
//             if(nums[i] - nums[i-1] == 1)
//                 seqCount++;
//             else if(nums[i] - nums[i-1] == 0)
//                 continue;
//             else{
//                 seqCount = 0;
//             }
            
//             maxCons = Math.max(maxCons,seqCount);
//         }
        
//         return maxCons + 1;
        
        //2nd attempt : Hashset
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int num : nums){
            hs.add(num);
        }
        
        int longestStreak = 0;
        
        for(int num : nums){
            if(!hs.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                
                while(hs.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                
                longestStreak = Math.max(longestStreak,currentStreak);
            }
            
        }
        
        return longestStreak;
        
        
    }
}