import java.util.LinkedList;
import java.util.Queue;

public class p207 {
    public static int[] inDegree;
    public static Queue<Integer> q;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        inDegree = new int[numCourses];
        q = new LinkedList<>();
        int cnt = 0;

        for(int[] pre : prerequisites){
            inDegree[pre[0]]++;
        }

        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0){
                q.add(i);
                cnt++;
            }
        }

        while(!q.isEmpty()){
            int now = q.poll();

            for(int[] pre : prerequisites){
                if(pre[1] == now){
                    if(--inDegree[pre[0]] == 0){
                        cnt++;
                        q.add(pre[0]);
                    }
                }
            }
        }

        return cnt == numCourses;
    }
}
