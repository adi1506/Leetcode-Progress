class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n = nums.size();
        return method2(nums, n);
    }

    int method1(vector<int>& arr, int n){
        int maxSum = INT_MIN;
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum += arr[j];
                maxSum = max(sum, maxSum);
            }
            
        }
        return maxSum;
    }

    int method2(vector<int>& arr, int n){
        int maxSum = INT_MIN;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum+=arr[i];
            maxSum = max(sum, maxSum);
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;

    }
};