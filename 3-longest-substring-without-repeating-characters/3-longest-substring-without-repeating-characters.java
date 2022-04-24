class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        
        if(n == 0 || n == 1)
            return s.length();
        int ls = 0;
        for(int i = 0; i < n; i++){
            Set<Character> hs = new HashSet<Character>();
            for(int j = i; j < n ; j++){
                if(hs.contains(s.charAt(j))){
                    
                    break;
                }
                ls = Math.max(ls,j-i+1);
                hs.add(s.charAt(j));
            }
        }
        
        return ls;
    }
}