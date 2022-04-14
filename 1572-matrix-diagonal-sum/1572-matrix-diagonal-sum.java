class Solution {
    public int diagonalSum(int[][] mat) {
        //1st attempt : brute force : TO O(n^2)
        
//         int sum = 0;
        
//         //iterating through every element
//         for(int i = 0; i < mat.length; i++){
//             for(int j = 0; j<mat[i].length;j++){
//                 //for primary diagonal -> i==j
//                 //for secondary diagonal -> i+j == mat[i].length -1
//                 if(i==j || i+j == mat[i].length-1)
//                     sum += mat[i][j];
//             }
//         }
//         return sum;
        
        //2nd Attempt : Optimised : TO O(n)
        
        int sum = 0;
        int n = mat.length;
        
        //just a single loop
        for(int i = 0; i < n; i++){
            sum += mat[i][i]; //for primary diagonal
            sum += mat[i][n-i-1]; //for secondary diagonal
        }
        
        // if(n%2 == 1){
        //     sum -= mat[(n-1)/2][(n-1)/2];
        // }
        
        //for odd matrix, central item is added twice, so removing it once 
        return n%2 == 0 ? sum : sum - mat[n/2][n/2];
    }
}