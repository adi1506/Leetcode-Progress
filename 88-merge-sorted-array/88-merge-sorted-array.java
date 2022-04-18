class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         //1st attempt : TC : O(nlogn + (m+n)) : using userdefined function to sort array
        //SC : O(1)
//         for(int i = m; i<nums1.length;i++){
//             nums1[i] = nums2[i-m];
//         }
        
//         Arrays.sort(nums1); //TC O(nlogn)
    
    
        //2nd attempt : TC : O(m+n) , SC : O(1)
//         int i = m-1;
//         int j = n-1;
//         int a = nums1.length-1;
//         while(i >= 0 && j >= 0){
//             if(nums1[i] >= nums2[j]){
//                 nums1[a] = nums1[i];
//                 i--;
//                 a--;
//             }
//             else{
//                 nums1[a] = nums2[j];
//                 j--;
//                 a--;
//             }
//         }

//         while(i >= 0){
//             nums1[a] = nums1[i];
//                 i--;
//                 a--;
//         }

//         while(j >= 0){
//             nums1[a] = nums2[j];
//                 j--;
//                 a--;
//        }
        
        //3rd attempt : same as 2nd attempt but concise
        int tail1 = m-1, tail2 = n-1, finished = nums1.length - 1;
        while(tail1 >= 0 && tail2 >= 0)
            nums1[finished--] = (nums1[tail1] > nums2[tail2] ? nums1[tail1--] : nums2[tail2--]);
        
        while(tail2 >= 0)
            nums1[finished--] = nums2[tail2--];
    }
}