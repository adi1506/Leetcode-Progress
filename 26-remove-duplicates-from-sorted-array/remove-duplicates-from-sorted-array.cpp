class Solution {
public:
    int removeDuplicates(vector<int>& arr) {
        int n = arr.size();
        int s = 0;
        int uni = INT_MIN;

        for(int i = 0; i<n; i++){
            if(arr[i] != uni){
                uni = arr[i];
                swap(arr[i], arr[s]);
                s++;
            }
        }
        return s;
    }
};