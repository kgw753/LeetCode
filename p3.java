import java.util.HashMap;
import java.util.Map;

public class p3 {
    public int lengthOfLongestSubstring(String s) {
        int mx = 0;
        int startIdx = 0;
        Map<Character, Integer> mp = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(mp.containsKey(c)){
                startIdx = Math.max(startIdx, mp.get(c) + 1);
            }

            mp.put(c, i);
            mx = Math.max(mx, startIdx - i + 1);
        }

        return mx;
    }
}