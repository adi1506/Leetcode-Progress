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
        //TC : O(M*N)
        //SC : O(M+N)
//         int M = mat.length;
//         int N = mat[0].length;
//         int[] arrM = new int[M];
//         int[] arrN = new int[N];
            
//         for(int i = 0; i < M; i++){
//             for(int j = 0; j < N; j++){
//                 if(mat[i][j] == 0){
//                     arrM[i] = -1;
//                     arrN[j] = -1;
//                 }
//             }
//         }
        
//         for(int i = 0; i < M; i++){
//             for(int j = 0; j < N; j++){
//                 if(mat[i][j] != 0 && (arrM[i] == -1 || arrN[j] == -1)){
//                     mat[i][j] = 0;
//                 }
//             }
//         }
        
        //3rd attempt : most optimal approach, using no extra space
        
        int M = mat.length;
        int N = mat[0].length;
        int col = 1;
        
        for(int i = 0; i < M; i++){
            if(mat[i][0] == 0) col = 0;
            for(int j = 1; j < N; j++){
                if(mat[i][j] == 0)
                    mat[i][0] = mat[0][j] = 0;
            }
        }
        
        for(int i = M-1; i>=0; i--){
            for(int j = N-1; j>=1; j--){
                if(mat[i][0] == 0 || mat[0][j] == 0)
                    mat[i][j] = 0;
            }
            if(col == 0)
                mat[i][0] = 0;
        }
        
        
        
        
    }
}