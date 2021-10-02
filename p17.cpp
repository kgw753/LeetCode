#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int mx;
    string dig;
    vector<string> str = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    void go(int idx, int depth, string s, vector<string> &v){
        if(depth == mx){
            v.push_back(s);
            return;
        }
        
        for(int i = 0; i < str[idx].length(); i++){
            s += str[idx][i];
            go(dig[depth + 1] - '0' - 2, depth + 1, s, v);
            s.pop_back();
        }
    }
    vector<string> letterCombinations(string digits) {
        dig = digits;
        mx = digits.length();
        vector<string> ret;
        if(digits.empty()) return ret;
        go(digits[0] - '0' - 2, 0, "", ret);
        return ret;
    }
};
int main(){
    string input;
    cin >> input;
    Solution s;
    vector<string> ret = s.letterCombinations(input);
    for(string r : ret) cout << r << "\n";
}