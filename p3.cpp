#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
   int lengthOfLongestSubstring(string s) {
        int ret = 0;
        vector<char> v;
        for(int i = 0; i < s.length(); i++){
            auto iter = find(v.begin(), v.end(), s[i]);
            if(iter != v.end()) v.erase(v.begin(), ++iter);
            v.push_back(s[i]);
            ret = max(ret, (int)v.size());
        }
        return ret;
    }
};