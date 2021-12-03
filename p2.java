// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode();
        ListNode p = ret;
        int carry = 0;
        int now;
        while(l1 != null && l2 != null){
            now = l1.val + l2.val + carry;
            l1 = l1.next; l2 = l2.next;
            p.next = new ListNode(now % 10);
            p = p.next;
            carry = now / 10;
        }

        while(l1 != null){
            now = l1.val + carry;
            l1 = l1.next;
            p.next = new ListNode(now % 10);
            p = p.next;
            carry = now / 10;
        }
        
        while(l2 != null){
            now = l2.val + carry;
            l2 = l2.next;
            p.next = new ListNode(now % 10);
            p = p.next;
            carry = now / 10;
        }
        if(carry > 0) p.next = new ListNode(carry);
        return ret.next;
    }
}