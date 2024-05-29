class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        return method3(arr);
    }

    //method1 - linear search 
    int method1(vector<int> &arr){
        int max = INT_MIN;
        int maxIndex = -1;
        for(int i = 0; i<arr.size();i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    int method2(vector<int> &arr){
        int n = arr.size();
        int s = 0;
        int e = n-1;
        int mid = s+ (e-s)/2;

        while(s<e){
            if(arr[mid] < arr[mid+1]){
                s = mid +1;
            }
            else{
                e = mid;
            }
            mid = s + (e-s)/2;
        }
        return mid;
    }

    //store and compute
    int method3(vector<int> &arr){
        int n = arr.size();
        int s = 0;
        int e = n-1;
        int mid = s+ (e-s)/2;
        int ansIndex = -1;
        while(s<=e){
            if(arr[mid] < arr[mid+1]){
                s = mid +1;
            }
            else{
                ansIndex = mid;
                e = mid-1;
            }
            mid = s + (e-s)/2;
        }
        return ansIndex;
    }
};