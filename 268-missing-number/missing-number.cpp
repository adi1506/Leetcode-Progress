class Solution {
public:
    int missingNumber(vector<int>& arr) {
        int n = arr.size();

        //method 1 : brute force
        // for(int i =0; i<n; i++){
        //     int ctr = -1;
        //     for(int j = 0; j<n; j++){
        //         if(arr[j] == i){
        //             ctr = 0;
        //             break;
        //         }
                    
        //     }
        //     if(ctr == -1){
        //         return i;
        //     }
        // }
        // return n;


        //method2 : sorting and iterating

        // //sorting the array
        // sort(nums.begin(), nums.end());

        // //iterating over the array
        // for(int i =0; i<nums.size(); i++){
        //     if(nums[i] != i )
        //         return i;
        // }

        // return nums.size();

        //method 3 : arithmetic - sum

        // int sumOfArr = accumulate(arr.begin(), arr.end(), 0);
        // return n*(n+1)/2 - sumOfArr;

        //method 4 : arithmetic XOR
        // int res1 = 0;
        // int res2 = 0;
        // for(int i = 0; i<n; i++){
        //     res1 ^= (i+1);
        //     res2 ^= arr[i];
        // }

        // return res1^res2;

        //method 5 : binary search

        sort(arr.begin(), arr.end());

        int s = 0;
        int e = n-1;
        int mid = s + (e-s)/2;
        int ansIndex = -1;

        while (s<=e){
            int num = arr[mid];
            int index = mid;
            int diff = num-index;

            if(diff == 0){
                s = mid +1;
            }
            else if(diff == 1){
                ansIndex = mid;
                e = mid - 1;
            }
            mid = s + (e-s)/2;
        }

        
        if(ansIndex == -1){
            return n;
        }
        return ansIndex;
    }
};