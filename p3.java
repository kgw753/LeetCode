import java.util.HashMap;
import java.util.Map;

public class p3 {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int start = 0;
        Map<Character, Integer> mp = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(mp.containsKey(c)){
                start = Math.max(start, mp.get(c) + 1);
            }

            mp.put(c, i);
            res = Math.max(res, (i + 1) - start);
        }

        return res;
    }

    public static void main(String[] args){
        practice p =  new practice();

        p.lengthOfLongestSubstring("abba");
    }
}
