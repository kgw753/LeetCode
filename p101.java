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

    public boolean isSymmetric(TreeNode node1, TreeNode node2){
        if(node1 != null && node2 != null){
            if(node1.val == node2.val){
                return isSymmetric(node1.left, node2.right) &&
                        isSymmetric(node1.right, node2.left);
            }
            else return false;
        } else {
            return node1 == null && node2 == null;
        }
    }
}
