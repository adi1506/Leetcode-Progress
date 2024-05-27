class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        return method2(prices, n);
    }

    //method 1: brute force
    int method1(vector<int>& arr, int n){
        int finalAns = 0;
        for(int i = 0; i< n-1; i++){
            int ans = 0;
            for(int j = i+1; j < n ; j++){
                ans = arr[j] - arr[i];
                finalAns = max(ans, finalAns);
            }
        }
        return finalAns;
    }

    // method 2: 
    int method2(vector<int> arr, int n){
        int minPrice = arr[0];
        int profit = 0;
        for(int i = 1; i<n; i++){
            int cost = arr[i] - minPrice;
            profit = max(cost, profit);
            minPrice = min(minPrice, arr[i]);
        }
        return profit;
    }
};