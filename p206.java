
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class p206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public ListNode reverseListRecur(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode node, ListNode prev){
        if(node == null) return prev;
        ListNode next = node.next;
        node.next = prev;
        prev = node;
        node = next;
        return reverse(node, prev);
    }
}
