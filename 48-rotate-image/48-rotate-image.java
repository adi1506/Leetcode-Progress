class Solution {
    public void rotate(int[][] matrix) {
        //1st attempt
//         int n = matrix.length;
//         for(int i = 0; i < n ; i++){
//             for(int j = i; j < n; j++){
//                 swap1(matrix,i,j);
//             }
//         }
        
//         for(int i = 0; i< n; i++){
//             for(int j = 0; j < n/2; j++){
//                 swap2(matrix,i,j);       
//             }
//         }  
        
        //2nd attempt
        
        int n = matrix.length;
        
        for(int i =0; i<n; i++){
            for(int j = i; j<n;j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i =0; i<n; i++){
            for(int j = 0; j<n/2;j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
    
//     public void swap1(int[][] arr, int i, int j){
//         int temp = arr[i][j];
//         arr[i][j] = arr[j][i];
//         arr[j][i] = temp;
//     }
    
//     public void swap2(int[][] arr, int i, int j){
//         int temp = arr[i][j];
//         arr[i][j] = arr[i][arr.length - 1 - j];
//         arr[i][arr.length - 1 - j] = temp;
//     }
    
    public void swap(int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }
}