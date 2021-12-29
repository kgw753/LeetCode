import java.util.HashMap;
import java.util.Map;

public class p3 {
    public Map<Character, Integer> mp = new HashMap<>();
    public int lengthOfLongestSubstring(String s) {
        int ret = 0;
        int startIdx = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(mp.containsKey(c)){
                startIdx = Math.max(startIdx, mp.get(c) + 1);
            }
            
            mp.put(c, i);
            ret = Math.max(ret, i - startIdx + 1);
        }

        return ret;
    }   

    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.lengthOfLongestSubstring("bbbbb"));
    }
}