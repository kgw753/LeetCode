import java.util.HashMap;
import java.util.Map;

public class p3 {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        int start = 0;
        Map<Character, Integer> mp = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(mp.containsKey(c)) {
                start = Math.max(start, mp.get(c) + 1);
            }

            mp.put(c, i);
            len = Math.max(len, (i + 1) - start);
        }

        return len;
    }
    public static void main(String[] args){
        p3 p = new p3();
        System.out.println(p.lengthOfLongestSubstring("dvdf"));
        System.out.println(p.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(p.lengthOfLongestSubstring("abba"));
    }
}
