import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<List<Integer>> ret;
    public List<List<Integer>> combine(int n, int k) {
        ret = new ArrayList<>();
        combi(new ArrayList<>(), 0, n, k);
        return ret;
    }

    public static void combi(List<Integer> list, int now, int n, int k){
        if(list.size() == k){
            ret.add(new ArrayList<>(list));
            return;
        }

        for(int i = now + 1; i <= n ; i++){
            list.add(i);
            combi(list, i, n, k);
            list.remove(list.size() - 1);
        }
    }
}