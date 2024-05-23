class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& arr) {
        int n = arr.size();
        int ctr = 0;
        int finalAns = 0;

        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                ctr =0;
            }
            else if(arr[i] == 1){
                ctr++;
                if(finalAns < ctr){
                    finalAns = ctr;
                }
            }
            
        }
        return finalAns;
    }
};