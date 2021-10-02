#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int ret = 1e9;
        sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size(); i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int lo = i + 1;
            int hi = nums.size() - 1;
            while(lo < hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                if(sum == target) return sum;
                if(abs(ret - target) > abs(sum - target)) ret = sum;
                if(sum < target) lo++;
                else if(sum > target) hi--;
            }
        }
        return ret;
    }
};
int main(){
    int n, t;
    cin >> n >> t;
    vector<int> v(n);
    for(int i = 0; i < n; i++){
        cin >> v[i];
    }
    Solution s;
    cout << s.threeSumClosest(v, t) << "\n";
}