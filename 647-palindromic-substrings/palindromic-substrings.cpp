class Solution {
public:

    int expandAroundCenter(string s, int i, int j){
        int count = 0;
        while(i>=0 && j<s.length() && s[i] == s[j]){
            count++;
            i--;
            j++;
        }
        return count;
    }

    int countSubstrings(string s) {
        int totalCount = 0;
        for(int center = 0; center<s.length(); center++){
            //odd
            int i = center;
            int j = center;
            int oddPalSubStrCnt = expandAroundCenter(s,i,j);

            //even
            i = center;
            j = center+1;
            int evenPalSubStrCnt = expandAroundCenter(s,i,j);

            totalCount += oddPalSubStrCnt + evenPalSubStrCnt;
        }
        return totalCount;
    }
};