import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p169 {
    public int majorityElement(int[] nums) {
        int ret = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int n : nums){
            if(mp.containsKey(n)) mp.put(n, mp.get(n) + 1);
            else mp.put(n, 1);
        }
        for(int key : mp.keySet()){
            if(mp.get(key) > nums.length / 2) ret = key;
        }

        return ret;
    }

    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
