class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        List<Integer> maj = new ArrayList<Integer>();
        for(int i = 0;i < n; i++){
            
            for(int j = i; j< n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            
          
            if(count > n/3 && !maj.contains(nums[i]))
                maj.add(nums[i]);
            
            count = 0;
                
        }
        
        return maj;
    }
}