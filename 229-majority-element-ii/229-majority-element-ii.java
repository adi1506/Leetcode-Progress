class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //1st attempt : brute force
        // TC : O(N^2)
        // SC : O(1)
//         int n = nums.length;
//         int count = 0;
//         List<Integer> maj = new ArrayList<Integer>();
//         for(int i = 0;i < n; i++){
            
//             for(int j = i; j< n; j++){
//                 if(nums[i] == nums[j]){
//                     count++;
//                 }
//             }
            
          
//             if(count > n/3 && !maj.contains(nums[i]))
//                 maj.add(nums[i]);
            
//             count = 0;
                
//         }
        
//         return maj;
        
        //2nd attempt : Moore's Voting Algorithm
        List<Integer> maj = new ArrayList<Integer>();
        int n = nums.length;
        
        int el1 = -1;
        int el2 = -1;
        int count1 = 0;
        int count2 = 0;
        
        for(int num : nums){
            if(el1 == num){
                count1++;
            }
            else if(el2 == num){
                count2++;
            }
            else if(count1 == 0){
                el1 = num;
                count1++;
            }
            else if(count2 == 0){
                el2 = num;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        int countEl1 = 0;
        int countEl2 = 0;
        for(int num : nums){
            if(num == el1) countEl1++;
            else if(num == el2) countEl2++;
        }
        
        if(countEl1 > n/3) maj.add(el1);
        if(countEl2 > n/3) maj.add(el2);
        
        return maj;
        
        //atempt 3 : need to do this with hashmap
        
    }
}