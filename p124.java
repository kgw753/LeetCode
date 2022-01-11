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

public class p124 {
    public static int mx;
    public int maxPathSum(TreeNode root) {
        mx = Integer.MIN_VALUE;
        goDown(root);
        return mx;
    }
    
    public static int goDown(TreeNode node){
        if(node == null) return 0;

        int right = Math.max(0, goDown(node.right));
        int left = Math.max(0, goDown(node.left));

        mx = Math.max(mx, node.val + right + left);

        return Math.max(right, left) + node.val;
    }
}
