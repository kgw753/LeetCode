#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool sign = true;
    int myAtoi(string s) {
        // 1. whitespace check
        while(s[0] == ' ') s.erase(0, 1);

        // 2. sign check
        if(s[0] == '-') sign = false;
        if(s[0] == '+' || s[0] == '-') s.erase(0, 1);

        // 3. '0' check
        while(s[0] == '0') s.erase(0, 1);

        // 4. digit check
        int pos = 0;
        while(s[pos] >= '0' && s[pos] <= '9') pos++;
        s.erase(s.begin() + pos, s.end());
        
        // 5. parse integer
        int ret = 0;
        for(int i = 0; i < s.length(); i++){
            if(ret > INT_MAX / 10){
                if(sign) return INT_MAX;
                else return INT_MIN;
            }
            else if(ret == INT_MAX / 10 && (s[i] - '0' > (INT_MAX % 10))){
                if(sign) return INT_MAX;
                else return INT_MIN;
            }
            ret = ret * 10 + (s[i] - '0');
        }
        return ret * (sign ? 1 : -1);
    }
};
int main(){
    Solution s;
    string str;
    getline(cin, str);
    cout << s.myAtoi(str) << "\n";
}