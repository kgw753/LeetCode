#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<string> ret;
    void go(string str, int s, int e, int depth){
        if(e == depth){
            ret.push_back(str);
            return;
        }
        if(s > depth) return;
        if(s > e){
            go(str + ")", s, e + 1, depth);
        }
        go(str + "(", s + 1, e, depth);
    }
    vector<string> generateParenthesis(int n) {
        go("", 0, 0, n);
        return ret;
    }
};
int main(){
    int N;
    Solution s;
    cin >> N;
    vector<string> ret = s.generateParenthesis(N);
    for(string s : ret) cout << s << "\n";
}