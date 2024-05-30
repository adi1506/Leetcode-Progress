class Solution {
public:

    int findPivot(vector<int>& arr, int n){
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;

        while(s<=e){
            if(s==e){
                return s;
            }
            if((mid+1 < n) && (arr[mid] > arr[mid+1])){
                return mid;
            }
            if(arr[mid] < arr[s]){
                e = mid -1;
            }
            else{
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        return -1;

    }

    int binarySearch(vector<int>& arr, int n, int s, int e, int target){
        int mid = s+(e-s)/2;

        while(s<=e){
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                s = mid+1;
            }
            else{
                e = mid -1;
            }
            mid = s+(e-s)/2;
        }
        return -1;

    }

    int search(vector<int>& arr, int target) {
        int n = arr.size();
        int pivot = findPivot(arr, n);

        if(target >= arr[0] && target<= arr[pivot]){
            int ans =  binarySearch(arr, n, 0 , pivot, target);
            return ans;
        }
        else{
            int ans = binarySearch(arr, n, pivot+1 , n-1, target);
            return ans;
        }

        return -1;

    }

    
};

