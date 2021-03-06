import java.util.ArrayList;
import java.util.List;

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
        goDown(root, 0);
        return ret;
    }

    public static void goDown(TreeNode node, int depth){
        if(node == null) return;
        if(ret.size() == depth) ret.add(new ArrayList<>());

        ret.get(depth).add(node.val);

        goDown(node.left, depth + 1);
        goDown(node.right, depth + 1);
    }
}