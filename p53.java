public class p53 {
    public static int maxSubArray(int[] nums) {
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum < 0) sum = 0;
            sum += nums[i];
            mx = Math.max(sum, mx);
        }
        return mx;
    }
}
