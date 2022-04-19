class Solution {
    public double myPow(double x, int n) {
        //1st attempt : Time limit exceeded
        // TC O(N)
//         double res = 1;
//         if(n>0){
//             for(int i = 1; i<=n ; i++) res *= x;
//         }
//         else if(n<0){
//             for(int i = n; i<0 ; i++) res /= x;
//         }
        
//         return res;
        
        //2nd attempt 
        return Math.pow(x,n);
    }
}