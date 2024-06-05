class Solution {
public:
    string decodeMessage(string key, string message) {
        unordered_map<char, char> mapping;
        char space = ' ';
        mapping[space] = space;
        char start = 'a';
        int index = 0;

        //mapping
        while(start<= 'z' && index < key.length()){
            if(mapping.find(key[index]) != mapping.end()){
                index++;
            }
            else{
                mapping[key[index]] = start; 
                index++;
                start++;
            }
        }
        

        //decoding
        string ans = "";
        for(int i = 0; i<message.length(); i++){
            // char msgChar = message[i];
            // char mappedChar = mapping[msgChar];
            // ans.push_back(mappedChar);
            ans.push_back(mapping[message[i]]);
        }
        return ans;
    }
};