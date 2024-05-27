class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int n = nums.size();
        return method1(nums, n);
    }

    //method 1: brute force
    vector<int> method1(vector<int> &arr, int n){
        vector<int> posArr;
        vector<int> negArr;
        for(int i = 0; i<n; i++){
            if(arr[i] > 0){
                posArr.push_back(arr[i]);
            }
            else{
                negArr.push_back(arr[i]);
            }
        }    
        for(int i = 0;i<n/2;i++){
            arr[2*i] = posArr[i];
            arr[2*i + 1] = negArr[i];
        }
        return arr;
    }
};