class Solution {
public:

    void normalise(string &str){
        char start = 'a';
        unordered_map<char, char> mapping;

        for(int i = 0; i<str.length();i++){
            char strChar = str[i];
            if(mapping.find(strChar) == mapping.end()){
                mapping[strChar] = start;
                start++;
            }
        }

        for(int i =0; i<str.length(); i++){
            str[i] = mapping[str[i]];
        }
    }

    vector<string> findAndReplacePattern(vector<string>& words, string pattern){
        normalise(pattern);
        vector<string> ans;
        //traverse on words -> normalise them -> check if its in pattern
        for(int i = 0; i<words.size(); i++){
            string currWord = words[i];
            
            normalise(currWord);
            if(currWord.compare(pattern) == 0){
                ans.push_back(words[i]);
            }
        }
        return ans;
    }
};