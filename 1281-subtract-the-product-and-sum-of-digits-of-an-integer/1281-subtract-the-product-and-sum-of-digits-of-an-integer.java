class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod =1;
        int res =0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            prod*=rem;
            n /= 10;
        }
        
        res = prod - sum;
        return res;
    }
}