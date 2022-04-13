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
        //iterating through the sentence string after converting it to an array
        for(char ch : sentence.toCharArray()){ 
            // ci holds analogous int value of each letter in 'sentence' i.e a=0; b=1;                    c=2...
            int ci = ch - 'a'; 
            //we are performing bit wise left shift here and performing OR operation.
            //(1 << ci) means => shifting the number left as many times the analogous int                 value of the letter
            //Eg. if a=0 => 1 ; if b=1 => 10 ; if c=2 => 100
            // if z=26 => 1 followed by 25 zeroes
            
            //performing OR operations on all the left shifted analogous values of each                 letter
            // https://leetcode.com/problems/check-if-the-sentence-is-pangram/discuss/1164135/Simple-solution-no-setmap for better understanding
            seen = seen | (1 << ci);
        }
        
        //now we are comparing seen with 11...11 (26 ones)
        return seen == ((1<<26) -1);
        
    }
}