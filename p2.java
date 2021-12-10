// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
      	ListNode ret = new ListNode();
      	ListNode now = ret;
      
        while(l1 != null || l2 != null){
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;

            int sum = l1Val + l2Val + carry;
            now.next = new ListNode(sum % 10);
            carry = sum / 10;
            now = now.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        if(carry == 1) now.next = new ListNode(carry);
        return ret.next;
    }
}