class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //1st attempt
        List<Boolean> result = new ArrayList<Boolean>();
        
//         using iterative approach is faster
        
//         int max = 0;
        
//         for(int ctr : candies){
//             if(ctr > max)
//                 max = ctr;
//         }
        
        //Using stream is slower
        
//         int max = Arrays.stream(candies).max().getAsInt();
        
        
//         for(int ctr : candies){
//             if(ctr + extraCandies >= max)
//                 result.add(true);
//             else
//                 result.add(false);
//         }
        
        //Optimised approach to reduce the n-steps of adding extraCandies everytime
        
        int max = 0;
        for(int ctr : candies){
            max = Math.max(ctr,max);
        }
        
        max -= extraCandies;
            
        for(int ctr : candies){
            result.add(ctr >= max);
        }
        
        return result;
    }
}