#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ret;
        sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size(); i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int lo = i + 1;
            int hi = nums.size() - 1;
            while(lo < hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                if(sum < 0) lo++;
                else if(sum > 0) hi--;
                else{
                    ret.push_back({nums[i], nums[lo], nums[hi]});
                    while(lo < nums.size() - 1 && nums[lo] == nums[lo + 1]) lo++;
                    while(hi > 0 && nums[hi] == nums[hi - 1]) hi--;
                    lo++, hi--;
                }
            }
        }
        return ret;
    }
};
int main(){
    int n;
    cin >> n;
    vector<int> v(n);
    for(int i = 0; i < n; i++){
        cin >> v[i];
    }
    Solution s;
    vector<vector<int>> ret = s.threeSum(v);
    for(vector<int> r : ret){
        for(int i : r) cout << i << " ";
        cout << "\n";
    }
}