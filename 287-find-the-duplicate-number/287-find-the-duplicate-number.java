class Solution {
    public int findDuplicate(int[] nums) {
        // //1st attempt : brute force : TC : O(N^2) ; SC : O(1)
        // int n = nums.length-1;
        // for(int i = 0 ; i<=n; i++){
        //     for(int j = i+1; j <=n; j++){
        //         if(nums[i] == nums[j])
        //             return nums[i];
        //     }
        // }
        // return 0;
        
        //2nd attempt : works only when the repeated int appears only twice
        //(but in the question it is given that it can appear more than twice)
        // int n = nums.length - 1;
        // int sum = n*(n+1)/2;
        // int arrSum = 0;
        // for(int num : nums) arrSum+=num;
        // // System.out.println(arrSum+" "+sum);
        // return arrSum-sum;
        
        //3rd attempt: sort the array and if arr[i] == arr[i+1] then arr[i] is duplicate
        //TC: O(nlogn + n)
        //SC: O(logn) // Array.sort uses this much space
        // Arrays.sort(nums);
        // for(int i = 0; i<nums.length-1; i++){
        //     if(nums[i] == nums[i+1])
        //         return nums[i];
        // }
        // return 0;
        
        //4th attempt: Linked List Cycle and Tortoise-Hare Algo
        
        int slow = nums[0];
        int fast = nums[0];
        
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        
        fast = nums[0];
        
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
        
        
    }
}