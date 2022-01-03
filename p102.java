import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }
}

public class p102 {
    public static List<List<Integer>> ret;

    public List<List<Integer>> levelOrder(TreeNode root) {
        ret = new ArrayList<>();

        go(root, 0);

        return ret;
    }    
    public static void go(TreeNode node, int level){
        if(node == null) return;
        if(ret.size() < level + 1) ret.add(new ArrayList<>());
        
        ret.get(level).add(node.val);

        if(node.left != null) go(node.left, level + 1);
        if(node.right != null) go(node.right, level + 1);
    }
}
