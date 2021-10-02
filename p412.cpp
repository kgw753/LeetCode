#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> ret;
        for(int i = 1; i <= n; i++){
            string str = "";
            if(i % 3 == 0) str += "Fizz";
            if(i % 5 == 0) str += "Buzz";
            if(str.empty()) str = to_string(i);
            ret.push_back(str);
        }
        return ret;
    }
};
int main(){
    int N;
    cin >> N;
    Solution s;
    vector<string> v = s.fizzBuzz(N);
    for(string str : v) cout << str << "\n";
}