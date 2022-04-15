class Solution {
    public void setZeroes(int[][] mat) {
        
        //1st attempt : brute force : only for positive values in matrix
        // tc O(N*M) + O(N+M)
        // sc O(1)
//         int M = mat.length;
//         int N = mat[0].length;
//         for(int i = 0; i < M; i++){
//             for(int j = 0; j < N; j++){
//                 if(mat[i][j] == 0){
//                     for(int k = 0; k<M; k++){
//                         if(mat[k][j] != 0){
//                             mat[k][j] = -1;
//                         }
//                     }
//                     for(int k = 0; k<N; k++){
//                         if(mat[i][k] != 0){
//                             mat[i][k] = -1;
//                         }
//                     }
//                 }
//             }
//         }
        
//         for(int i = 0; i < mat.length; i++){
//             for(int j = 0; j < mat[0].length; j++){
//                 if(mat[i][j] == -1){
//                     mat[i][j] = 0;
//                 }
//             }
//         }
        
        //2nd attempt : taking 2 dummy 1D arrays and storing the position of 0's.
        int M = mat.length;
        int N = mat[0].length;
        int[] arrM = new int[M];
        int[] arrN = new int[N];
        
        for(int i = 0; i<M ; i++){
            arrM[i] = -1;
        }
        for(int i = 0; i<N ; i++){
            arrN[i] = -1;
        }
        
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(mat[i][j] == 0){
                    arrM[i] = 0;
                    arrN[j] = 0;
                }
            }
        }
        
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(mat[i][j] != 0 && (arrM[i] == 0 || arrN[j] == 0)){
                    mat[i][j] = 0;
                }
            }
        }
        
        
        
        
    }
}