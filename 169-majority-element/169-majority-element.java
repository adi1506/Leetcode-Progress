class Solution {
    public int majorityElement(int[] nums) {
        //1st attempt : brute force : TC : O(n^2) ; SC : O(1)
        // int n = nums.length;
        // int prev = Integer.MIN_VALUE;
        // int count = 0;
        // for(int i = 0; i < n; i++){
        //     if(nums[i] != prev){
        //         for(int j = 0; j< n; j++){
        //             if(nums[j] == nums[i])
        //                 count++;
        //         }    
        //     }
        //     prev = nums[i];
        //     if(count > n/2)
        //         return nums[i];
        //     else
        //         count = 0;
        // }
        // return 0;
        
        //2nd attempt : Moore's Voting Algorithm
        //TC : O(n)
        //SC : O(1)
        
//         int cnt = 0;
//         int el = 0;
        
//         for(int i = 0; i < nums.length; i++){
//             if(cnt == 0) el = nums[i];
//             if(el == nums[i]) cnt++;
//             else cnt--;
//         }
//         return el;
        
        //attempt 3 : using hashmap (need to do it later)
        
        //attempt 4 : using sorting
        Arrays.sort(nums);
        return nums[nums.length/2];
        
    }
}