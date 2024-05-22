class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n = nums.size();
        int fIndex = -1;
        int lIndex = -1;

        findFirst(nums, n, target, fIndex);
        findLast(nums, n, target, lIndex);

        return {fIndex, lIndex};
        
    }

    void findFirst(vector<int>& arr, int n, int target, int &fIndex){
        int s = 0;
        int e = n-1;
        int mid = s + (e-s)/2;
        while(s <= e){
            if(arr[mid] == target){
                fIndex = mid;
                e = mid -1;
            }
            else if(arr[mid] < target){
                s = mid +1;
            }
            else if(arr[mid] > target){
                e = mid -1;
            }
            mid = s + (e-s)/2;
        }
    }

    void findLast(vector<int>& arr, int n, int target, int &lIndex){
        int s = 0;
        int e = n-1;
        int mid = s + (e-s)/2;
        while(s <= e){
            if(arr[mid] == target){
                lIndex = mid;
                s = mid +1;
            }
            else if(arr[mid] < target){
                s = mid +1;
            }
            else if(arr[mid] > target){
                e = mid -1;
            }
            mid = s + (e-s)/2;
        }
    }
};