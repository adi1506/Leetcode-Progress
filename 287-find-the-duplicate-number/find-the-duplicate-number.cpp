class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int n = nums.size();
        // return method1(nums, n);
        // return method2(nums, n);
        // return method3(nums, n);
        return method4(nums, n);
    }

    //method 1 : brute force -> nested for loop
    //Time limit exceeds
    int method1(vector<int>& arr, int n){
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }

    //method 2 : sort and search
    //TC : O(n)
    int method2(vector<int>& arr, int n){
        sort(arr.begin(), arr.end());
        for(int i =0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    //method 3 : Negative Markting Method
    int method3(vector<int>& arr, int n){
        int ans = -1;
        for(int i = 0; i<n; i++){
            int index = abs(arr[i]);

            if(arr[index] < 0){
                ans = index;
                break;
            }

            arr[index] *= -1;
        }
        return ans;
    }

    //method 4 : Arranging the elements to their index
    int method4(vector<int>& arr, int n){
        while(arr[0] != arr[arr[0]]){
            swap(arr[0], arr[arr[0]]);
        }
        return arr[0];
    }
};