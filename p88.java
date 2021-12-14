public class p88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = 0;
        int idx2 = 0;
        int res[] = new int[m + n];

        for(int i = 0; i < m + n; i++){
            if(idx1 == m) res[i] = nums2[idx2++];
            else if(idx2 == n) res[i] = nums1[idx1++];
            else{
                if(nums1[idx1] < nums2[idx2]) res[i] = nums1[idx1++];
                else res[i] = nums2[idx2++];
            }
        }

        for(int i = 0; i < m + n; i++) nums1[i] = res[i];
    }

    public static void main(String[] args){
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        merge(new int[]{1}, 1, new int[]{}, 0);
    }
}
