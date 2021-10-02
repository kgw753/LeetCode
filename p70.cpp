#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int dp[50];
    int climbStairs(int n) {
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i < 46; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
};
int main(){
    int N;
    cin >> N;
    Solution s;
    cout << s.climbStairs(N) << "\n";
}
