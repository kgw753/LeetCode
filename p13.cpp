#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int romanToInt(string s) {
        map<char, int> mp;
        mp['I'] = 1, mp['V'] = 5, mp['X'] = 10, mp['L'] = 50;
        mp['C'] = 100, mp['D'] = 500, mp['M'] = 1000;
        int ret = 0;
        for(int i = 0; i < s.length(); i++){
            if(i + 1 != s.length() && mp[s[i]] < mp[s[i + 1]]){
                ret += mp[s[i + 1]] - mp[s[i]];
                i++;
            }
            else ret += mp[s[i]];
        }
        return ret;
    }
};
int main(){
    string input;
    cin >> input;
    Solution s;
    cout << s.romanToInt(input) << "\n";
}