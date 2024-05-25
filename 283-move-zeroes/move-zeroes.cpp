class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int n = nums.size();
        // method1(arr, n);
        method2(nums, n);

    }

    //method 1 : DNF - wrong method- changes the order of the non-zero elements
    void method1(vector<int> &nums, int n){
        int l = 0;
        int h = n -1;

        while(l<h){
            if(nums[l] != 0){
                l++;
            }
            else if(nums[l] == 0){
                swap(nums[l], nums[h]);
                h--;
            }
        }
    }

    void method2(vector<int> &arr, int n){
        int j;

        for(j = 0; j<n; j++){
            if(arr[j] == 0){
                break;
            }
        }

        for(int i = j+1; i<n; i++){
            if(arr[i] != 0){
                swap(arr[i], arr[j]);
                j++;
            }
        }
    }
};