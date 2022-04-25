class Solution {
    public int lengthOfLongestSubstring(String s) {
        //1st attempt : brute force
        // TC : O(N^2)
        // SC : O(N)
//         int n = s.length();
        
//         if(n == 0 || n == 1)
//             return s.length();
//         int ls = 0;
//         for(int i = 0; i < n; i++){
//             Set<Character> hs = new HashSet<Character>();
//             for(int j = i; j < n ; j++){
//                 if(hs.contains(s.charAt(j))){
                    
//                     break;
//                 }
//                 ls = Math.max(ls,j-i+1);
//                 hs.add(s.charAt(j));
//             }
//         }
        
//         return ls;
        
        //2nd attempt : 
        //TC : O(2N) : the string is traversed 2 times : once by r and l
        //SC : O(N) : HashSet used
   
//         int n = s.length();
        
//         if(n <= 1)
//             return n;
        
//         int maxans = 0;
//         int l = 0;
//         Set<Character> hs = new HashSet<Character>();
        
//         for(int r = 0; r < n ; r++){
//             if(hs.contains(s.charAt(r))){
//                 while(l < r && hs.contains(s.charAt(r))){
//                     hs.remove(s.charAt(l));
//                     l++;
//                 }
//             }
//             hs.add(s.charAt(r));
//             maxans = Math.max(maxans,r-l+1);
//         }
        
//         return maxans;
        
        //3rd attempt : 
        
        int n = s.length();
        
        if(n<=1)
            return n;
        
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        int l = 0;
        int maxans = 0;
        
        for(int r = 0; r < n; r++){
            if(hm.containsKey(s.charAt(r))){
                l = Math.max(l,hm.get(s.charAt(r)) +1);
                // hm.put(s.charAt(r),r);
            }
            hm.put(s.charAt(r),r);
            maxans = Math.max(maxans, r-l+1);
            
        }
        
        return maxans;
        
    }
}