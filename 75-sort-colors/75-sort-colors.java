class Solution {
    public void sortColors(int[] nums) {
        
        //1st attempt : brute force : TC O(n) SC O(1)
        int r = 0;
        int w = 0;
        int b = 0;
        
        //counting each number of colors
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0)
                r++;
            else if(nums[i] == 1)
                w++;
            else if(nums[i] == 2)
                b++;
        }
        
        //adding 0 (red color) in r times
        for(int i = 0; i<r; i++){
            nums[i] = 0;
        }
        
        //adding white color w times starting from rth postion to (r+w)th position
        for(int i = r; i<w+r; i++){
            nums[i] = 1;
        }
        
        //adding blue color b times starting from (r+w)th postion to (r+w+b)th position
        for(int i = r+w; i<r+w+b; i++){
            nums[i] = 2;
        }
    }
}