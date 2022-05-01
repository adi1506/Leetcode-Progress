// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int i = 0, j = 0;
        int K = pat.length();
        int N = txt.length();
        int ans = 0;
        
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        
        char[] strArray = pat.toCharArray();
        
        for(char c : strArray){
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        
        int count = map.size();
        
        // for (Map.Entry<Character, Integer> e : map.entrySet())
        //     System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());

        while(j < N){
            //calculation
            if(map.containsKey(txt.charAt(j))){
                map.put(txt.charAt(j),map.get(txt.charAt(j))-1);
                if(map.get(txt.charAt(j)) == 0)
                count--;
            }
                
            
            //fixed
            if(j-i+1 < K)
                j++;
            else if(j-i+1 == K){
                //answer from calculation
                if(count == 0)
                    ans++;
                //sliding the window
                if(map.containsKey(txt.charAt(i))){
                    map.put(txt.charAt(i),map.get(txt.charAt(i))+1);
                    if(map.get(txt.charAt(i)) == 1)
                        count++;
                }
                    
                
                    
                i++;
                j++;
            }
        }
        return ans;
    }
}