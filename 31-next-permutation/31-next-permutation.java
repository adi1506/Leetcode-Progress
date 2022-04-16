//1st attempt

// class Solution {
//     public void nextPermutation(int[] A) {
        
//         if(A == null || A.length <= 1) return;
//         int i = A.length - 2;
//         while(i >= 0 && A[i] >= A[i + 1]) i--; 
//         if(i >= 0) {                           
//             int j = A.length - 1;              
//             while(A[j] <= A[i]) j--;      
//             swap(A, i, j);                     
//         }
//         reverse(A, i + 1, A.length - 1);    
//     }
        
//     public void swap(int[] A, int i, int j) {
//         int tmp = A[i];
//         A[i] = A[j];
//         A[j] = tmp;
//     }

//     public void reverse(int[] A, int i, int j) {
//         while(i < j) swap(A, i++, j--);
//     }
// }


class Solution {
    public void nextPermutation(int[] nums) {
        //edge case
        if(nums.length <= 1 || nums == null ) return;
        
        //nums[i] <= nums[i+1];
        
        int i = nums.length - 2;
        while(i>=0 && nums[i] >= nums[i+1] ) i--;
        
        //if i<0 then that means the number does not have a larger lexicographical rearrangement
        // therefore it will become the 1st possible rearrangement
        if(i>=0){
            //nums[i] <= nums[j]
            int j = nums.length - 1;
            while(nums[j] <= nums[i]) j--;
            
            //swap i and j
            swap(nums, i, j);
        }
        
        //reverse from i+1 till end
        reverse(nums, i+1, nums.length - 1);
        
        
    }
    
    public void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    public void reverse(int[] A, int i, int j){
        while(i<j) swap(A,i++,j--);
    }
        
    
}