class Solution {
    public void sortColors(int[] nums) {
        //can also be done using any sorting algo 
            //for that TC O(nlogn)
        
        
//         //1st attempt : brute force : TC O(2*n) SC O(1)
//         int r = 0;
//         int w = 0;
//         int b = 0;
        
//         //counting each number of colors
//         for(int i = 0; i<nums.length; i++){
//             if(nums[i] == 0)
//                 r++;
//             else if(nums[i] == 1)
//                 w++;
//             else if(nums[i] == 2)
//                 b++;
//         }
        
//         //adding 0 (red color) , r times
//         for(int i = 0; i<r; i++){
//             nums[i] = 0;
//         }
        
//         //adding white color w times starting from (r-1)th postion to (r+w-1)th position
//         for(int i = r; i<w+r; i++){
//             nums[i] = 1;
//         }
        
//         //adding blue color b times starting from (r+w-1)th postion to (r+w+b-1)th position
//         for(int i = r+w; i<r+w+b; i++){
//             nums[i] = 2;
//         }
        
        //2nd attempt : Dutch National Flag Algorithm
        //TC : O(n) ; SC : O(1)
        
        int l = 0;
        int m = 0;
        int h = nums.length - 1;
        
        while(m <= h){
            if(nums[m] == 0){
                swap(nums,l,m);
                l++;
                m++;
            }
            else if(nums[m] == 1){
                m++;
            }
            else if(nums[m] == 2){
                swap(nums,m,h);
                h--;
            }
        }
            
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}