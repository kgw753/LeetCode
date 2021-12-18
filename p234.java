
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class p234 {
    public boolean isPalindrome(ListNode head) {
        StringBuffer sb = new StringBuffer();
        while(head != null){
            sb.append((char)(head.val + '0'));
            head = head.next;
        }

        int mid = sb.length() / 2;
        String pre = sb.toString().substring(0, mid);
        String post = sb.reverse().substring(0, mid);
        
        return pre.equals(post);
    }
}
