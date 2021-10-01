#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int maxArea(vector<int>& height) {
        int lo, hi;
        lo = 0, hi = height.size() - 1;
        int ret = 0;
        while(lo < hi){
            ret = max(ret, (hi - lo) * min(height[lo], height[hi]));
            if(height[lo] > height[hi]) hi--;
            else lo++;
        }
        return ret;
    }
};