import java.util.Scanner;

public class p125 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        p125 p = new p125();
        System.out.println(p.isPalindrome(str));
    }
    public boolean isPalindrome(String s) {
        String str = parsing(s);
        int mid = str.length() / 2;
        String pre = str.substring(0, mid);
        if(str.length() % 2 == 1) mid++;
        StringBuffer sb = new StringBuffer(str.substring(mid));
        String post = sb.reverse().toString();

        return pre.equals(post);
    }

    public static String parsing(String s){
        String ret = "";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(checkChar(c)) ret += parsing(c);
        }
        return ret;
    }

    public static char parsing(char c){
        if(c >= 'A' && c <= 'Z') return (char)(c - 'A' + 'a');
        else return c;
    }

    public static boolean checkChar(char c){
        return ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }
}
