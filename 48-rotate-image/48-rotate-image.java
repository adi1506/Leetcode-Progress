class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n ; i++){
            for(int j = i; j < n; j++){
                swap(matrix,i,j);
            }
        }
        
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n/2; j++){
                // swap(matrix,i,n-1-j);
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
        
        System.out.println(Arrays.deepToString(matrix));
        
    }
    
    public void swap(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}