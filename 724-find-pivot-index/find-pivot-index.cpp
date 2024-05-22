class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        //brute force method 
        // int n = nums.size();
        // for(int i = 0; i<n; i++){
        //     int leftSum = 0;
        //     int rightSum = 0;
        //     //finding left sum
        //     for(int j = i-1; j>=0; j--){
        //         leftSum += nums[j];
        //     }

        //     //finding right sum
        //     for(int j = i+1; j<n; j++){
        //         rightSum += nums[j];
        //     }

        //     if(leftSum == rightSum){
        //         return i;
        //     }
        // }
        // return -1;

        //Optimal method - adding up the leftsum

        //finding sum of all the elements of array
        int n = nums.size();
        int arrSum = 0;
        for(auto it: nums){
            arrSum += it;
        }
        
        //iterating over the array and adding up the current element
        //to the leftsum and comparing the rightsum
        int leftSum = 0;
        for(int i = 0; i<n; i++){
            int rightSum = arrSum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
};