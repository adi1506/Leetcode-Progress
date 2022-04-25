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
        
        //2nd attempt
        
//         int n = s.length();
        
//         if(n == 0 || n == 1)
//             return s.length();
        
//         int l = 0;
//         int r = 0;
        
//         int ls = 0;
//         Set<Character> hs = new HashSet<Character>();
        
//         while((l < r) || (r > n)){
//             if(hs.contains(s.charAt(r))){
//                 hs.remove(s.charAt(l));
//                 l++;
//             }
//             else{
                
//                 hs.add(s.charAt(r));
//                 r++;
//             }
//             ls = Math.max(ls,r-l+1);
//         }
        
//         return ls;
        
        //3rd attempt
        
//         int n = s.length();
        
//         if(n == 0 || n == 1)
//             return s.length();
        
        
//         int maxans = Integer.MIN_VALUE;
//         Set < Character > set = new HashSet < > ();
//         int l = 0;
//         for (int r = 0; r < n; r++) // outer loop for traversing the string
//         {
//             if (set.contains(s.charAt(r))) //if duplicate element is found
//             {
//                 while (l < r && set.contains(s.charAt(r))) {
//                     set.remove(s.charAt(l));
//                     l++;
//                 }
//             }
//             set.add(s.charAt(r));
//             maxans = Math.max(maxans, r - l + 1);
//         }
//         return maxans;
        
        
        int n = s.length();
        
        if(n <= 1)
            return n;
        
        int maxans = 0;
        int l = 0;
        Set<Character> hs = new HashSet<Character>();
        
        for(int r = 0; r < n ; r++){
            if(hs.contains(s.charAt(r))){
                while(l < r && hs.contains(s.charAt(r))){
                    hs.remove(s.charAt(l));
                    l++;
                }
            }
            hs.add(s.charAt(r));
            maxans = Math.max(maxans,r-l+1);
        }
        
        return maxans;
        
    }
}