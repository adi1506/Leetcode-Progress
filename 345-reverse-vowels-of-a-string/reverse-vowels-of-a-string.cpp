class Solution {
public:
    string reverseVowels(string s) {
        return method1(s);
    }

    string method1(string s){
        int l = 0;
        int h = s.length() - 1;

        while(l<=h){
            if((s[l] == 'a' || s[l] == 'e' || s[l] == 'i' || s[l] == 'o' || s[l] == 'u' || s[l] == 'A' || s[l] == 'E' || s[l] == 'I' || s[l] == 'O' || s[l] == 'U') && (s[h] == 'a' || s[h] == 'e' || s[h] == 'i' || s[h] == 'o' || s[h] == 'u' || s[h] == 'A' || s[h] == 'E' || s[h] == 'I' || s[h] == 'O' || s[h] == 'U') ){
                char temp = s[l];
                s[l] = s[h];
                s[h] = temp;
                l++;
                h--;
            }
            else if(!(s[l] == 'a' || s[l] == 'e' || s[l] == 'i' || s[l] == 'o' || s[l] == 'u' || s[l] == 'A' || s[l] == 'E' || s[l] == 'I' || s[l] == 'O' || s[l] == 'U')){
                l++;
            }
            else{
                h--;
            }
        }
        return s;
    }
};