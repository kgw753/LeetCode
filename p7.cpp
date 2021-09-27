class Solution {
public:
    int reverse(int x) {
        string str = to_string(x);
        std::reverse(str.begin(), str.end());
        bool flag = false;
        if(str[str.length() - 1] == '-') {
            flag = true;
            str.pop_back();
        }
        long long ret = stol(str);
        if(ret > INT_MAX || ret < INT_MIN) return 0;
        if(flag) ret *= -1;
        return ret;
    }
};