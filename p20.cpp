#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        for(char c : s){
            if(c == '(' || c == '{' || c == '[') st.push(c);
            else if(c == ')'){
                if(st.size() && st.top() == '(') st.pop();
                else return false;
            }
            else if(c == '}'){
                if(st.size() && st.top() == '{') st.pop();
                else return false; 
            }
            else if(c == ']'){
                if(st.size() && st.top() == '[') st.pop();
                else return false;
            }
        }
        if(st.empty()) return true;
        else return false;
    }
};
int main(){
    Solution s;
    string str;
    cin >> str;
    if(s.isValid(str)) cout << "true\n";
    else cout << "false\n";
}