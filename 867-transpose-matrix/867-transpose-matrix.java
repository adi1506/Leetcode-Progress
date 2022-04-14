class Solution {
    public int[][] transpose(int[][] matrix) {
        //1st attempt : brute force
        int[][] resArr = new int[matrix[0].length][matrix.length];
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                resArr[j][i] = matrix[i][j];
            }
        }
        
        return resArr;
    }
}