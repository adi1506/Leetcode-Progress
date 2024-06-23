class Solution {
public:
    int myAtoi(string s) {
        // return atoi(s.c_str());
        

        int num = 0, i = 0, sign = 1;
        //removing white spaces
        while(s[i] == ' '){
            i++;
        }

        //determining the sign
        if(i < s.length() && (s[i] == '-' || s[i] == '+')){
            sign = s[i] == '+' ? 1 : -1;
            i++;
        }

        //handing the digits until we reach a non digit
        while(i < s.length() && (s[i] >= '0' && s[i] <= '9')){
            if(num > INT_MAX / 10 || (num == INT_MAX / 10 && s[i] > '7')){
                return sign == -1 ? INT_MIN : INT_MAX;
            }
            num = num * 10 + (s[i] - '0');
            i++;
        }
        return num*sign;
    }
};