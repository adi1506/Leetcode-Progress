class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int rowNum = matrix.size();
        int colNum = matrix[0].size();

        int n = rowNum*colNum;
        int s = 0;
        int e = n-1;

        int mid = s+(e-s)/2;

        while(s<=e){
            int row = mid/colNum;
            int col = mid%colNum;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return false;
    }
};