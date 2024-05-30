class Solution {
public:

    int practice1(vector<int>& nums, int target){
        int n = nums.size();
        int s= 0;
        int e = n-1;
        int mid  = s + (e-s)/2;

        while(s<=e){
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                s = mid+1;
            }
            else{
                e = mid -1;
            }
            mid = s+(e-s)/2;
        }
        return -1;
    }

    int search(vector<int>& nums, int target) {
        // int n = nums.size();
        // int s = 0;
        // int e = n-1;
        // int mid = s+ (e-s)/2;
        
        // while(s<=e){
        //     if(nums[mid] == target){
        //         return mid;
        //     }
        //     else if(nums[mid] < target){
        //         s = mid +1;
        //     }
        //     else if(nums[mid] > target){
        //         e = mid -1;
        //     }
        //     mid = s+ (e-s)/2;
        // }

        // return -1;
        return practice1(nums, target);
    }


};