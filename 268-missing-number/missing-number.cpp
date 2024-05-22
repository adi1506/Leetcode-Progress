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
        int res1 = 0;
        int res2 = 0;
        for(int i = 0; i<n; i++){
            res1 ^= (i+1);
            res2 ^= arr[i];
        }

        return res1^res2;
    }
};