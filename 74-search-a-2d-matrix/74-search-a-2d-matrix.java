class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //1st attempt : brute force
        //TC : O(n^2)
        //SC : O(1);
//         int m = matrix.length;
//         int n = matrix[0].length;
        
//         for(int i = 0 ; i < m ; i++){
//             for(int j = 0 ; j < n ; j++){
//                 if(matrix[i][j] == target)
//                     return true;
//             }
//         }
        
//         return false;
        
        //2nd attempt : 
        int m = matrix.length;
        int n = matrix[0].length;
        
        int row = 0;
        for(int i = 0; i<m; i++){
            if(target >= matrix[i][0] && target <= matrix[i][n-1])
                row = i;
        }
        
        int start = 0;
        int end = n-1;
        
        
        while(start <= end){
            int mid = (start+end)/2;
            if(target == matrix[row][mid])
                return true;
            else if(target < matrix[row][mid])
                end = mid-1;
            else
                start = mid+1;
        }
        if(start < n && matrix[row][start] == target)
            return true;
        else return false;
        // System.out.println(row);
        // return false;
    }
}