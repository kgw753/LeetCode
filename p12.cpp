#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    string four[3] = {"IV", "XL", "CD"};
    string nine[3] = {"IX", "XC", "CM"};
    string roman[4][2] = {
        {"I", "V"}, {"X", "L"}, {"C", "D"}, {"M"}
    };
    string makeRom(int n, int k){
        if(k == 4) return four[n];
        if(k == 9) return nine[n];
        string ret = "";
        while(k - 5 >= 0){
            ret += roman[n][1];
            k -= 5;
        }
        while(k - 1 >= 0){
            ret += roman[n][0];
            k -= 1;
        }
        return ret;
    }
    string intToRoman(int num) {
        int n = 0;
        int tmp = num;
        while(tmp > 0){
            tmp /= 10;
            n++;
        }
        string ret = "";
        for(int i = n - 1; i >= 0; i--){
            int k = num / pow(10, i);
            ret += makeRom(i, k);
            num %= (int)pow(10, i);
        }
        return ret;
    }
};
int main(){
    int n;
    Solution s;
    cin >> n;
    cout << s.intToRoman(n) << "\n";
}