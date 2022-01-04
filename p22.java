import java.util.ArrayList;
import java.util.List;

public class p22 {
    public static List<String> ret;
    public List<String> generateParenthesis(int n) {
        ret = new ArrayList<>();
        
        go("", 0, 0, n);

        return ret;
    }

    public static void go(String str, int l, int r, int size){
        if(l == size && r == size){
            ret.add(str);
            return;
        }

        if(l < size){
            go(str + "(", l + 1, r, size);
        }
        if(r < l){
            go(str + ")", l, r + 1, size);
        }
    }
}
