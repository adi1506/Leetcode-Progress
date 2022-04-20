class Solution {
    public int uniquePaths(int m, int n) {
        //1st attempt : recursion : time limit exceeded
        //TC : Exponential
        //SC : Exponential
        // return uniquePathHelper(0,0,m,n);
        
        //2nd attempt : DP
        //TC : O(M*N)
        //SC : O(M*N)
        
        // return uniquePathHelper(0,0,m,n,new int[m][n]);
        
        //3rd attempt : Using Maths
        
        int N = m+n-2;
        int R = m-1;
        
        double res = 1;
        
        for(int i = 1; i <= R; i++)
            res = res * (N-R+i)/i;
        
        return (int)res;
        
    }
    
    //function for recursive solution
    
    // public int uniquePathHelper(int i, int j,int m,int n){
    //     if(i >=m || j >= n) return 0;
    //     else if(i == (m-1) && j == (n-1)) return 1;
    //     else return uniquePathHelper(i+1,j,m,n) + uniquePathHelper(i,j+1,m,n);
    // }
    
    //function for dp
    
    // public int uniquePathHelper(int i, int j,int m,int n,int[][] dp){
    //     if(i >=m || j >= n) return 0;
    //     else if(i == (m-1) && j == (n-1)) return 1;
    //     if(dp[i][j] != -1) return dp[i][j];
    //     else return dp[i][j] = uniquePathHelper(i+1,j,m,n,dp) + uniquePathHelper(i,j+1,m,n,dp);
    // }
}