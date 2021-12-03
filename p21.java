// class ListNode{
//     public int val;
//     public ListNode next;
//     ListNode(){}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next){ this.val = val; this.next = next; }
// }
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ret = new ListNode();
        ListNode p = ret;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                p.next = new ListNode(list1.val);
                p = p.next;
                list1 = list1.next;
            }
            else{
                p.next = new ListNode(list2.val);
                p = p.next;
                list2 = list2.next;
            }
        }
        while(list1 != null){
            p.next = new ListNode(list1.val);
            p = p.next;
            list1 = list1.next;
        }
        while(list2 != null){
            p.next = new ListNode(list2.val);
            p = p.next;
            list2 = list2.next;
        }
        return ret.next;
    }
}