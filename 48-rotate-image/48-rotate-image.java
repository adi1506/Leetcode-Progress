class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n ; i++){
            for(int j = i; j < n; j++){
                swap1(matrix,i,j);
            }
        }
        
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n/2; j++){
                swap2(matrix,i,j);
                
                
            }
        }
        
        System.out.println(Arrays.deepToString(matrix));
        
    }
    
    public void swap1(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    
    public void swap2(int[][] arr, int i, int j){
        int temp = arr[i][j];
        arr[i][j] = arr[i][arr.length - 1 - j];
        arr[i][arr.length - 1 - j] = temp;
    }
}