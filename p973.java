import java.util.Comparator;
import java.util.PriorityQueue;

public class p973 {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ret = new int[k][2];

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] a1, int[] a2){
                return a1[0] - a2[0];
            }
        });

        int[] pos;
        int dist;
        for(int i = 0; i < points.length; i++){
            pos = points[i];
            dist = pos[0] * pos[0] + pos[1] * pos[1];
            pq.add(new int[]{dist, i});
        }

        for(int i = 0; i < k; i++){
            ret[i] = points[pq.poll()[1]];
        }

        return ret;
    }
}
