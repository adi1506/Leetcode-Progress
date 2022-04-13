class Solution {
    public int largestAltitude(int[] gain) {
        //1st attempt
        for(int i = 1; i<gain.length;i++){
            gain[i] += gain[i-1];
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i : gain){
            max = Math.max(max,i);
        }
        
        if(max < 0) return 0;
        else return max;
        
    }
}