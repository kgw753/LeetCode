public class p696 {
    public int countBinarySubstrings(String s) {
        int cnt = 0;

        int now = 1;
        int prev = 0;

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i - 1)) now++;
            else{
                cnt += Math.min(prev, now);
                prev = now;
                now = 1;
            }
        }
        
        return cnt + Math.min(prev, now);
    }
}
