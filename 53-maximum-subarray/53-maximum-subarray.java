class Solution {
    public int maxSubArray(int[] nums) {
//         //1st attempt : brute force : O(n^3) : takes so much time that time limit exceeded
//         int sum = 0;
//         int max = -10001;
//         int len = nums.length;
//         for(int i = 0; i<len; i++){
//             for(int j = i; j<len; j++){
//                 for(int k = i; k<=j ; k++){
//                     sum += nums[k]; 
//                 }
//                 max = Math.max(sum,max);
//                 sum=0;
//             }
            
//         }
        
//         return max;
        
//         //2nd attempt : O(N^2) : time limit exceeded
        
//         int sum = 0;
//         int max = -10001;
//         int len = nums.length;
//         for(int i = 0; i<len; i++){
//             sum = 0;
//             for(int j = i; j<len; j++){
//                 sum += nums[j];
//                 max = Math.max(sum,max);
//             }
            
            
//         }
        
//         return max;
        
        //3rd attempt : O(n)
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            
            // max = Math.max(sum,max);
            max = (max>sum ? max : sum);
            
            if(sum < 0){
                sum = 0;
            }
        }
        
        return max;
        
        
        
    }
}