class Solution {
public:
    int getOddOccuringEl(vector<int>& arr, int n) {
        int s = 0;
        int e = n - 1;
        int mid = s + ((e - s) / 2);

        while (s <= e) {
            // 1. for single element
            if (s == e) {
                // when there is only one element
                return arr[s];
            }
            if(arr[0] != arr[1]){
                return arr[0];
            }
            if(arr[n-1] != arr[n-2]){
                return arr[n-1];
            }
            // 2. for no duplicate
            else if ((mid - 1 >= 0) && arr[mid] != arr[mid - 1] &&
                     (mid + 1 < n) && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }
            // 3. duplicate in left index
            else if (mid - 1 >= 0 && arr[mid] == arr[mid - 1]) {
                int pairStartingIndex = mid - 1;
                if (pairStartingIndex & 1) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            // 4. duplicate in right index
            else if (mid + 1 < n && arr[mid] == arr[mid + 1]) {
                int pairStartingIndex = mid;
                if (pairStartingIndex & 1) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }

            mid = s + ((e - s) / 2);
        }
        return -1;
    }

    int singleNonDuplicate(vector<int>& nums) {
        int n = nums.size();
        return getOddOccuringEl(nums, n);
    }
};