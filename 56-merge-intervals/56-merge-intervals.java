class Solution {
    public int[][] merge(int[][] intervals) {
        //TC : O(nlogn + n)
        //SC : O(N)
        if(intervals.length <=1)
            return intervals;
        
        Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        
        List<int[]> outputArr = new ArrayList<int[]>();
        
        int[] currentInterval = intervals[0];
        outputArr.add(currentInterval);
        
        for(int[] interval : intervals){
            int current_begin = currentInterval[0];
            int current_end = currentInterval[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            
            if(current_end >= next_begin)
                currentInterval[1] = Math.max(current_end,next_end);
            else{
                currentInterval = interval;
                outputArr.add(currentInterval);
            }
        }
        
        return outputArr.toArray(new int[outputArr.size()][]);
        
    }
    

}