import java.util.ArrayList;
import java.util.List;

public class p22 {
    public static List<String> ret;
    public List<String> generateParenthesis(int n) {
        ret = new ArrayList<>();

        go(0, 0, "", n);

        return ret;
    }

    public static void go(int l, int r, String str, int size){
        if(l == size && r == size){
            ret.add(str);
            return;
        }

        if(l <= size) {
            go(l + 1, r, str + "(", size);
            if(l > r){
                go(l, r + 1, str + ")", size);    
            }    
        }
    }
}
