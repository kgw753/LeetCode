
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class p206 {
    public ListNode reverseList(ListNode head) {
        ListNode ret = null;
        while(head != null){
            ret = new ListNode(head.val, ret);
            head = head.next;
        }
        return ret;
    }
}
