public class p121 {
    public int maxProfit(int[] prices) {
        int ret = 0;
        int mn = Integer.MAX_VALUE;
        int mx = -1;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < mn){
                mn = prices[i];
                mx = prices[i];
            }
            mx = Math.max(prices[i], mx);
            ret = Math.max(ret, mx - mn);
        }

        return ret;   
    }
}
