class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//         //1st attempt : brute force
//         int ctr = 0;
        
//         //iterating over items and checking where ruleKey & ruleValue matches and updating that it in the ctr
//         for(List<String> item : items){        
//             if(ruleKey.equals("type") && ruleValue.equals(item.get(0))){
//                 ctr++;
//             }
//             else if(ruleKey.equals("color") && ruleValue.equals(item.get(1))){
//                 ctr++;
//             }
//             else if(ruleKey.equals("name") && ruleValue.equals(item.get(2))){
//                 ctr++;
//             }
//         }
        
//         return ctr;
        
        //2nd attempt : finding the type first
        
        int ctr = 0;
        int type = -1;
        
        switch(ruleKey){
                case "type" -> type = 0;
                case "color" -> type = 1;
                case "name" -> type = 2;
        }
        
        for(List<String> item : items){
            if(item.get(type).equals(ruleValue))
                ctr++;
        }
        return ctr;
    }
}