class Solution {
    public boolean checkIfPangram(String sentence) {
        //1st attempt was wrong
        
        //2nd Attempt => after seeing the solution =>
        
//         boolean[] checkArr = new boolean[26];
        
//         // mapping true/false in a new array for each letter. 
//         for(char c : sentence.toCharArray()){
//             checkArr[c - 'a'] = true;
//         }
        
//         //if there is any false, then we can return false
//         for(boolean checkLetter : checkArr){
//             if(!checkLetter) return false;
//         }
        
//         return true;
        
        //3rd attempt =>after seeing another solution
        //doesnt requires an extra array
        
        int seen = 0;
        for(char ch : sentence.toCharArray()){
            int ci = ch - 'a';
            seen = seen | (1 << ci);
        }
        
        return seen == ((1<<26) -1);
        
    }
}