import java.util.Stack;

public class p9{
    public boolean isPalindrome(int x) {
        Stack<Character> st = new Stack<>();
        String str = Integer.toString(x);
        int mid = str.length() / 2;
        for(int i = 0; i < mid; i++){
            st.add(str.charAt(i));
        }
        if(str.length() % 2 == 1) mid++;
        for(int i = mid; i < str.length(); i++){
            if(st.pop() != str.charAt(i)) return false;
        }
        return true;
    }
}