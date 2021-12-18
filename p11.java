public class p11 {
    public int maxArea(int[] height) {
        int lo = 0;
        int hi = height.length - 1;
        int mx = -1;

        while(lo < hi){
            int here = (hi - lo) * Math.min(height[lo], height[hi]);
            mx = Math.max(mx, here);

            if(height[lo] > height[hi]) hi--;
            else lo++;
        }
        
        return mx;
    }
}
