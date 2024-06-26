class Solution {
public:
    int beautySum(string s) {
        return method2(s);
    }

    int findBeauty(string str){
        if(str.length() == 0 || str.length() == 1) return 0;
        map<char, int> mapping;

        for(auto c : str){
            mapping[c]++;
        }

        int maxFreq = INT_MIN;
        int minFreq = INT_MAX;

        for(auto it : mapping){
            if(it.second < minFreq){
                minFreq = it.second;
            }
            if(it.second > maxFreq){
                maxFreq = it.second;
            }
        }
        return maxFreq - minFreq;
    }

    int method1(string s){
        int sum = 0;
        for(int i = 0; i< s.length(); i++){
            string temp = "";
            for(int j = i; j< s.length(); j++){
                temp += s[j];
                sum += findBeauty(temp);
            }
        }
        return sum;
    }

    int method2(string s){
        int beautySum = 0;
        unordered_map<char, int> mp;

        for(int i = 0; i< s.length(); i++){
            mp.clear();
            for(int j = i; j<s.length(); j++){
                mp[s[j]]++;

            int mini = INT_MAX;
            int maxi = INT_MIN;

            for(auto it: mp){
                maxi = max(maxi, it.second);
                mini = min(mini, it.second);
            }

            beautySum += (maxi - mini);
            }
        }
        return beautySum;
    }
};