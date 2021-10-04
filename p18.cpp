#include<bits/stdc++.h>
using namespace std;
typedef long long ll;
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> ret;
        sort(nums.begin(), nums.end());
        int size = nums.size();
        for(int i = 0; i < size - 3; i++){
            if((ll)nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            if((ll)nums[i] + nums[size - 1] + nums[size - 2] + nums[size - 3] < target) continue;
            for(int j = i + 1; j < size - 2; j++){
                if((ll)nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                if((ll)nums[i] + nums[j] + nums[size - 1] + nums[size - 2] < target) continue;
                int target2 = target - nums[i] - nums[j];
                int start = j + 1;
                int end = size - 1;
                while(start < end){
                    if((ll)nums[start] + nums[end] > target2) end--;
                    else if((ll)nums[start] + nums[end] < target2) start++;
                    else{
                        ret.push_back({nums[i], nums[j], nums[start], nums[end]});
                        start++, end--;
                        while(start < end && nums[start] == ret.back()[2]) start++;
                        while(start < end && nums[end] == ret.back()[3]) end--;
                    }
                }
                while(j < size - 1 && nums[j] == nums[j + 1]) j++;
            }
            while(i < size - 1 && nums[i] == nums[i + 1]) i++;
        }
        return ret;
    }
};
int main(){

}