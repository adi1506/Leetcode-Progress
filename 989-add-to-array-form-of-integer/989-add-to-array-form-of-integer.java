class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

                  
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