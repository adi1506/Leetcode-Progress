string orderCopy;
class Solution {
public:

    static bool cmp(char a, char b){
        //true -> a will be placed before b
        //false -> b will be placed before a
        return (orderCopy.find(a) < orderCopy.find(b));
    }

    string customSortString(string order, string s) {
        orderCopy = order;
        sort(s.begin(), s.end(), cmp);
        return s;
    }
};