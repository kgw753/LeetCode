public class p696 {
    public int countBinarySubstrings(String s) {
        int ret = 0;
        int now = 1;
        int prev = 0;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i - 1) != s.charAt(i)){
                ret += Math.min(prev, now);
                prev = now;
                now = 1;
            }
            else{
                now++;
            }
        }
        return ret + Math.min(prev, now);
    }
}