class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ret = "";
        int mnLen = Integer.MAX_VALUE;
        int idx = 0;
        for(int i = 0; i < strs.length; i++){
            if(mnLen > strs[i].length()){
                mnLen = strs[i].length();
                idx = i;
            }
        }
        for(int i = 0; i < mnLen; i++){
            for(int j = 0; j < strs.length; j++){
                if(strs[j].charAt(i) != strs[idx].charAt(i)) return ret;
            }
            ret += strs[idx].charAt(i);
        }
        return ret;
    }
}