class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& arr) {
        int m = arr.size();
        int n = arr[0].size();
        vector<int> res;

        // 1st try
        //  for(int i = 0; i<=m/2; i++){
        //      for(int j = i; j<n-i; j++){
        //          res.push_back(arr[i][j]);
        //      }
        //      for(int j = i+1 ; j<m-i; j++){
        //          res.push_back(arr[j][n-i-1]);
        //      }
        //      for(int j = n-i-2; j>=i; j--){
        //          res.push_back(arr[m-i-1][j]);
        //      }
        //      for(int j = m-i-2; j>=i+1; j--){
        //          res.push_back(arr[j][i]);
        //      }
        //  }

        // solution
        int top = 0;
        int right = n - 1;
        int bottom = m - 1;
        int left = 0;

        while (top <= bottom && left <= right) {
            // right
            for (int i = left; i <= right; i++) {
                res.push_back(arr[top][i]);
            }

            top++;

            // bottom
            for (int i = top; i <= bottom; i++) {
                res.push_back(arr[i][right]);
            }

            right--;

            // left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.push_back(arr[bottom][i]);
                }

                bottom--;
            }

            // top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.push_back(arr[i][left]);
                }
                left++;
            }
        }

        return res;
    }
};