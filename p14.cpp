#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ret = "";
        bool flag;
        char cmp;
        for(int i = 0; i < 200; i++){
            flag = true;
            cmp = strs[0][i];
            for(string s : strs){
                if(i == s.length() || s[i] != cmp) {
                    flag = false;
                    break;
                }
            }
            if(flag) ret += cmp;
            else break;
        }
        return ret;
    }
};