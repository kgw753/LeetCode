import java.util.Arrays;
import java.util.Comparator;

class Solution {

    /**
     * 1. Sort by Distance
     * Time Complexity : O(NlogN)
     */
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, new Comparator<int[]>(){
            @Override
            public int compare(int[] p1, int[] p2){
                return getDist(p1) - getDist(p2);
            }
        });

        return Arrays.copyOfRange(points, 0, k);
    }
    
    public static int getDist(int[] pos){
        return pos[0] * pos[0] + pos[1] * pos[1];
    }

    /**
     * 2. Quick Select
     * Time Complexity : O(N)
     */
    public int[][] kClosestQuickSelect(int[][] points, int k) {
        quickSelect(points, 0, points.length - 1, k);
        return Arrays.copyOfRange(points, 0, k);
    }

    public static void quickSelect(int[][] points, int l, int h, int k){
        if(l >= h) return;
        int pivotIdx = partition(points, l, h);

        if(pivotIdx == k - 1){
            return;
        }
        else if(pivotIdx < k - 1){
            quickSelect(points, pivotIdx + 1, h, k);
        }
        else{
            quickSelect(points, l, pivotIdx - 1, k);
        }
    }

    public static int partition(int[][] points, int l , int h){
        int pivot = getDist(points[h]);
        int i = l - 1;

        for(int j = l; j < h; j++){
            if(getDist(points[j]) < pivot){
                swap(points, ++i, j);
            }
        }
        swap(points, ++i, h);

        return i;
    }
    public static void swap(int[][] arr, int i, int j){
        int[] tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}