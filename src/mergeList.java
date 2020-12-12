/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class mergeList {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode l3 = node;
        while(l1 != null || l2 != null){
            if(l1 == null){
                node.next = l2;
                break;
            }else if(l2 == null){
                node.next = l1;
                break;
            }else{
                if(l1.val < l2.val){
                    node.next = l1;
                    l1 = l1.next;
                }else{
                    node.next = l2;
                    l2 = l2.next;
                }
                node = node.next;
            }
        }

        return l3.next;

    }

}
