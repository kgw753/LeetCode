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

public class p572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(isSame(root, subRoot)) return true;

        boolean left = (root.left == null) ? false : isSubtree(root.left, subRoot);
        boolean right = (root.right == null) ? false : isSubtree(root.right, subRoot);

        return left || right;
    }

    public boolean isSame(TreeNode t1, TreeNode t2){
        if(t1 != null && t2 != null){
            if(t1.val == t2.val){
                return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
            }
            else return false;
        }
        else{
            return t1 == null && t2 == null;
        }
    }

}
