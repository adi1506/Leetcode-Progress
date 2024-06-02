class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n = nums.size();
        return method1(nums, k, n);
    }

    //method1
    int method1(vector<int>& arr, int k, int n){
        int sumCount = 0;
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum+=arr[j];
                if(sum == k){
                    sumCount++;
                }
            }
        }
        return sumCount;
    }
};