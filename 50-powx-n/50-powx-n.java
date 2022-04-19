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
        
        //2nd attempt : used inbuilt library XD
        // return Math.pow(x,n);
        
        //3rd attempt : iterative/mathematical approach
        
        double ans = 1.0;
        long nn = n;
        if(nn < 0) nn *= -1;
        
        while(nn > 0){
            if(nn % 2 == 1){
                ans = ans * x;
                nn = nn -1;
            }
            else{
                x = x*x;
                nn = nn / 2;
            }
        }
        if(n < 0) ans = (double)1.0/(double)(ans); 
        return ans;
        
        
    }
}