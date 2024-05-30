class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        int n = nums.size();
        int first = findFirst(nums, n, target);
        int last = findLast(nums, n, target);
        return {first,last};
    }

    int findFirst(vector<int> &arr, int n, int target){
        int s = 0;
        int e = n-1;
        int mid  = s+ (e-s)/2;
        int ansIndex = -1;

        while(s<=e){
            if(arr[mid] == target){
                ansIndex = mid;
                e = mid -1;
            }
            else if(arr[mid] < target){
                s = mid +1;
            }
            else{
                e = mid -1;
            }
            mid = s + (e-s)/2;
        }
        return ansIndex;
    }

    int findLast(vector<int> &arr, int n, int target){
        int s = 0;
        int e = n-1;
        int mid  = s+ (e-s)/2;
        int ansIndex = -1;

        while(s<=e){
            if(arr[mid] == target){
                ansIndex = mid;
                s = mid +1;
            }
            else if(arr[mid] < target){
                s = mid +1;
            }
            else{
                e = mid -1;
            }
            mid = s + (e-s)/2;
        }
        return ansIndex;
    }
};

