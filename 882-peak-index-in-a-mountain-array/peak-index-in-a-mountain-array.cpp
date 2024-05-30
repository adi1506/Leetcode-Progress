class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int n = arr.size();
        int s = 0; 
        int e = n-1;
        int mid = s + (e-s)/2;
        int peakIndex = 0;

        while(s<=e){
            if(arr[mid] < arr[mid+1]){
                s = mid +1;
            }
            else{
                peakIndex = mid;
                e = mid - 1;
            }
            mid = s+ (e-s)/2;
        }
        return peakIndex;
    }
};