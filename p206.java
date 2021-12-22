
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
    
    public ListNode reverseList2(ListNode head){
        return reverse(head, null);
    }

    public ListNode reverse(ListNode here, ListNode there){
        if(here == null) return there;

        ListNode tmp = here.next;
        here.next = there;
        there = here;
        here = tmp;

        return reverse(here, there);
    }
}
