#include<bits/stdc++.h>
using namespace std;
string str;
int dp[1004][1004];
string longestPalindrome(string s) {
    int len = s.length();
    string ret = s.substr(0, 1);
    for(int i = 0; i < len; i++) dp[i][i] = 1;
    for(int i = 0; i < len - 1; i++){
        if(s[i] == s[i + 1]) {
            dp[i][i + 1] = 2;
            if(ret.length() == 1) ret = s.substr(i, 2);
        }
    }
    for(int size = 2; size < len; size++){
        for(int i = 0; i < len - size; i++){
            if(s[i] == s[i + size] && dp[i + 1][i + size - 1]) {
                dp[i][i + size] = dp[i][i + size - 1] + 1;
                if(ret.length() < size + 1){
                    ret = s.substr(i, size + 1);
                }
            }
        }
    }
    return ret;
}
int main(){
    string str;
    cin >> str;
    cout << longestPalindrome(str) << "\n";
}