class Solution {
    public int findNumbers(int[] nums) {
        
//         //1st attempt : brute force -> TC O(n^2)
//         int res = 0;
//         //iterating through every element
//         for(int num : nums){
//             int dig = 0;
//             //finding number of digits of every element
//             while(num > 0){
//                 dig++;
//                 num /= 10;
//             }
//             //if the digits are ven -> res++
//             if(dig%2 == 0)
//                 res++;
//         }
        
//         return res;
        
        //2nd attempt : optimised -> TC O(n)
        
//         int res = 0;
//         //for each element finding if its even by its range
//         for(int num : nums){
//             if((num > 9 && num < 100) || (num >999 && num <10000) || (num == 100000))
//                 res++;
//         }
        
//         return res;
        
        //3rd attempt : finding number of digits using log
        
        int res = 0;
        for(int num : nums){
            if(Math.floor(Math.log10(num) + 1) % 2 == 0)
                res++;
        }
        
        return res;
        
        
    }
}