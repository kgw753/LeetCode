import java.util.HashSet;
import java.util.Set;

public class p202 {
    public static Set<Integer> visited = new HashSet<>();

    public boolean isHappy(int n) {
        if(n == 1) return true;
        else if(visited.contains(n)) return false;
        
        visited.add(n);

        int next = 0;

        while(n > 0){
            next += (n % 10) * (n % 10);
            n /= 10;
        }

        return isHappy(next);
    }
}
