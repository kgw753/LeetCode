
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class practice {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while(head != null){
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }

        return prev;
    }

    public ListNode reverseListRecursive(ListNode head) {
        return recursive(head, null);
    }

    public static ListNode recursive(ListNode node, ListNode prev){
        if(node == null) return prev;

        ListNode next = node.next;
        node.next = prev;
        prev = node;
        node = next;

        return recursive(node, prev);
    }
}