import java.util.HashMap;
import java.util.Map;

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

public class p101 {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right){
        if(left != null && right != null){
            if(left.val == right.val){
                return isSymmetric(left.left, right.right) 
                    && isSymmetric(right.left, left.right);
            }
            else{
                return false;
            }
        }
        else{
            return left == null && right == null;
        }
    }
}