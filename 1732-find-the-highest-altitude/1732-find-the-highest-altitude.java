class Solution {
    public int largestAltitude(int[] gain) {
//         //1st attempt
        
//         //find the running sum of the array
//         //Eg i/p => [-5,1,5,0,-7]
//         //Eg running sum => [-5,-4,1,1,-6]
//         for(int i = 1; i<gain.length;i++){
//             gain[i] += gain[i-1];
//         }
        
//         //initialising max value
//         int max = Integer.MIN_VALUE;
        
//         //finding the max value from the running sum array
//         for(int i : gain){
//             max = Math.max(max,i);
//         }
        
        
//         if(max < 0) return 0;
//         else return max;
        
        //2nd Attempt: less code approach
        
        int sum =0 ;
        int max = 0;
        
        for(int i = 0;i <gain.length;i++){
            sum+= gain[i];
            if(sum > max) max = sum;
        }
        
        return max;
    }
}