#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int minMoves(vector<int>& nums) {
        int ret = 0;
        sort(nums.begin(), nums.end());
        for(int n : nums) ret += n - nums[0];
        return ret;
    }
};