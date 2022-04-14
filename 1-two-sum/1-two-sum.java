class Solution {
    public int[] twoSum(int[] nums, int target) {
        //1st attempt : brute force : simple iteration : TC O(n^2)
        
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+ nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
        
        //2nd attempt : 
        
    }
}