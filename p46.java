import java.util.ArrayList;
import java.util.List;

class Solution {
    public static boolean[] visited;
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        visited = new boolean[nums.length];
        
        go(ret, new ArrayList<>(), -1, nums);

        return ret;
    }

    public static void go(List<List<Integer>> res, List<Integer> list, int now, int[] nums){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(visited[i]) continue;

            visited[i] = true;
            list.add(nums[i]);
            go(res, list, i, nums);
            visited[i] = false;
            list.remove(list.size() - 1);
        }
    }
}