class Solution {
public:
    int removeDuplicates(vector<int>& arr) {
        int n = arr.size();
        int s = 0;

        for(int i = 0; i<n; i++){
            if(arr[i] != arr[s]){
                arr[s+1] = arr[i];
                s++;
            }
        }
        return s+1;
    }
};