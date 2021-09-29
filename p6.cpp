#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    string convert(string s, int numRows) {
        if(numRows == 1) return s;
        string sArr[numRows];
        for(int i = 0; i < numRows; i++) sArr[i] = "";
        int row = 0;
        bool flag = false;
        for(int i = 0; i < s.length(); i++){
            sArr[row] += s[i];
            flag ? row-- : row++;
            if(row == 0 || row == numRows - 1) flag = !flag;
        }
        string ret = "";
        for(int i = 0; i < numRows; i++){
            ret += sArr[i];
        }
        return ret;
    }
};
int main(){
    string s;
    int n;
    cin >> s >> n;
    Solution sol;
    cout << sol.convert(s, n) << "\n";
}