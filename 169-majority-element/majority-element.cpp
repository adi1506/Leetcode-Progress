class Solution {
public:
    int majorityElement(vector<int>& arr) {
        int n = arr.size();
        return method3(arr, n);
    }

    //method 1 -> brute force -> finding the element which is occuring for the max times
    int method1(vector<int>& arr, int n){
        for(int i =0; i<n;i++){
            int tempCount = 0;
            for(int j =i; j<n; j++){
                if(arr[i] == arr[j]){
                    tempCount++;
                }
            }
            if(tempCount > (n/2)){
                return arr[i];
            }
        }
        return 0;
    }

    //method 2 -> Hashing
    int method2(vector<int>& arr, int n){
        //declare a map -> <el, freq>
        map<int, int> mpp;

        //frequency map
        for(int i = 0; i<n; i++){
            mpp[arr[i]]++;
        }

        //find the element whose count is > n/2
        for(auto it: mpp){
            if(it.second > n/2){
                return it.first;
            }
        }
        return -1;
    }


    //method3 : Moore's Voting algo
    int method3(vector<int>& arr, int n){
        int el;
        int count = 0;
        for(int i = 0; i< n; i++){
            if(count == 0){
                count = 1;
                el = arr[i];
            }
            else if(arr[i] == el){
                count++;
            }
            else{
                count--;
            }
            
        }
        return el;
    }
};