import java.util.HashMap;
import java.util.Map;

public class p217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int n : nums){
            if(mp.containsKey(n)) return true;
            else mp.put(n, 1);
        }

        return false;
    }
}
