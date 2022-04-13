class Solution {
    public boolean checkIfPangram(String sentence) {
        //1st attempt very wrong :(
        
//         boolean[] checkArr = new boolean[26];
//         boolean check = true;
        
//         // for(int i = 97; i<=122; i++){
//         //     for(int j=0; j<= sentence.length(); j++){
//         //         if(sentence.contains(i)){
//         //             checkArr[i-97] = true;
//         //         }
//         //     }
//         //     if(checkArr[i-97] == false)
//         //         break;
//         // }
        
//         for(int i = 97; i<=122; i++){
//             if(sentence.contains[i]){
//                 checkArr[i-97] = true;
//             }
//         }
        
//         for(boolean chk : checkArr){
//             check *= chk;
//         }
//        return check;
        
        //2nd Attempt => after seeing the solution
        
        boolean[] checkArr = new boolean[26];
        
        for(char c : sentence.toCharArray()){
            checkArr[c - 'a'] = true;
        }
        
        for(boolean checkLetter : checkArr){
            if(!checkLetter) return false;
        }
        
        return true;
        
    }
}