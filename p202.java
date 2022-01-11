import java.util.HashSet;
import java.util.Set;

public class p202 {
    public static Set<Integer> visited;
    public boolean isHappy(int n) {
        visited = new HashSet<>();
        return happyCheck(n);
    }

    public static boolean happyCheck(int n){
        if(n == 1) return true;
        else if(visited.contains(n)) return false;

        visited.add(n);

        int next = 0;

        while(n > 0){
            next += Math.pow(n % 10, 2);
            n /= 10;
        }

        return happyCheck(next);
    }
}
