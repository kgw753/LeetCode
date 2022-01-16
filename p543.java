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

public class p543 {
    public static int mx;
    public int diameterOfBinaryTree(TreeNode root) {
        goDown(root);
        return mx;
    }

    public static int goDown(TreeNode node){
        if(node == null) return 0;
        int left = goDown(node.left);
        int right = goDown(node.right);
        mx = Math.max(mx, left + right);
        return Math.max(left, right) + 1;
    }
}
