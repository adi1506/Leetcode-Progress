class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//         //1st attempt : TC : O(nlogn + (m+n)) : using userdefined function to sort array
//         for(int i = m; i<nums1.length;i++){
//             nums1[i] = nums2[i-m];
//         }
        
//         Arrays.sort(nums1); //TC O(nlogn)
    
    
        //2nd attempt
        int i = m-1;
        int j = n-1;
        int a = nums1.length-1;
        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[a] = nums1[i];
                i--;
                a--;
            }
            else{
                nums1[a] = nums2[j];
                j--;
                a--;
            }
        }

        while(i >= 0){
            nums1[a] = nums1[i];
                i--;
                a--;
        }

        while(j >= 0){
            nums1[a] = nums2[j];
                j--;
                a--;
        }
    }
}