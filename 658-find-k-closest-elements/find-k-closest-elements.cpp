class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        return method1(arr, k, x);
    }

    vector<int> method1(vector<int>& arr, int k, int x){
        int n = arr.size();
        int e = findClosest(arr, x);
        int s = e-1;

        while(k--){
            if(s<0){
                e++;
            }
            else if(e >= n){
                s--;
            }
            else if(x - arr[s] > arr[e] - x){
                e++;
            }
            else {
                s--;
            }
        }

        return vector<int>(arr.begin() + s+1, arr.begin() + e);
    }

    int findClosest(vector<int>& arr, int x){
        int n = arr.size();
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;
        int ans = e;

        while(s<=e){
            if(arr[mid] >= x){
                ans = mid;
                e = mid-1;
            }
            else if(x> arr[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s + (e-s)/2;

        }
        cout<<arr[ans];
        return ans;
    }

    //method1 - 2 pointer approach
    // vector<int> method2(vector<int> &arr, int k, int x){
    //     int n = arr.size();
    //     vector<int> resVec;
    //     int s = 0;
    //     int e = n-1;

    //     while((e - s + 1) != k){
    //         if(x - arr[s] > arr[e] - x){
    //             s++;
    //         }
    //         else{
    //             e--;
    //         }
    //     }

    //     for(int i = s; i<=e; i++){
    //         resVec.push_back(arr[i]);
    //     }
    //     return resVec;
    // }
};