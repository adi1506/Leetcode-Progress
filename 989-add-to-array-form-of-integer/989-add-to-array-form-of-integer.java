class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        //1st attempt : brute force : all cases were not cleared
        // eg [9,9,9,9,9,9,9,9,9,9]
        //     1
        
//         long sum = 0;
//         int len = num.length;
//         for(int i = 0; i < len; i++){
//             sum += num[i] * Math.pow(10,len-i-1);
//         }
        
//         sum += k;
//         int sumDig = (int)Math.floor(Math.log10(sum)+1);
//         List<Integer> sumArr = new ArrayList<Integer>(sumDig);
        
//         for(int i = 0 ; i < sumDig; i++){
//             sumArr.add(0, (int)sum%10);
//             sum /= 10;
//         }

        
//         return sumArr;
                  
        //2nd attempt : after seeing from youtube
        int len = num.length;
        List<Integer> res = new ArrayList<Integer>();
                  
        for(int i = len-1; i>=0 || k>0; i--){
            // k += num[i];
            // sumArr.add(0,k%10);
            // k /=10;
            
            res.add(0, (i >= 0 ? num[i] + k : k) % 10);
            k = (i >= 0 ? num[i] + k : k) / 10;
        }
        
        
        return res;
    }
}