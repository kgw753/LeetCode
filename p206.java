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

public class p206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev, next;
        prev = null;

        while(head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public ListNode reverseListRecursive(ListNode head){
        return reverseList(head, null);
    }

    public ListNode reverseList(ListNode now, ListNode prev){
        if(now == null) return prev;

        ListNode next = now.next;
        now.next = prev;
        prev = now;
        now = next;

        return reverseList(now, prev);
    }
}