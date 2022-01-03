import java.util.LinkedList;
import java.util.Queue;

public class p207 {
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();

        for(int[] pre : prerequisites){
            inDegree[pre[1]]++;
        }

        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0) q.add(i);
        }

        while(!q.isEmpty()){
            int now = q.poll();

            for(int i = 0; i < prerequisites.length; i++){
                if(now == prerequisites[i][0]){
                    if(--inDegree[prerequisites[i][1]] == 0){
                        q.add(prerequisites[i][1]);
                    }
                }
            }
        }

        for(int i : inDegree){
            if(i != 0) return false;
        }
        return true;
    }
}
