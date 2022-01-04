import java.util.LinkedList;
import java.util.Queue;

public class p207 {
    
    public static int[] inDegree;
    public static Queue<Integer> q = new LinkedList<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        inDegree = new int[numCourses];

        for(int[] prereq : prerequisites){
            inDegree[prereq[1]]++;
        }

        for(int i = 0; i < numCourses; i++){
            if(inDegree[i] == 0) q.add(i);
        }

        while(!q.isEmpty()){
            int here = q.poll();

            for(int[] prereq : prerequisites){
                if(prereq[0] == here){
                    if(--inDegree[prereq[1]] == 0){
                        q.add(prereq[1]);
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
