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
public class oddEvenLinkedlist {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode Oddhead = new ListNode(0);
        ListNode currOdd = Oddhead;
        ListNode Evenhead = new ListNode(0);
        ListNode currEve = Evenhead;
        boolean odd = true;

        //thought is make 2 linkedlist
        //one is composed with odd nodes
        //one is composed with even nodes
        while(head!=null){
            ListNode next = head.next;
            head.next = null;
            if(odd){
                currOdd.next = head;
                currOdd = currOdd.next;
            }else{
                currEve.next = head;
                currEve = currEve.next;
            }
            odd = !odd;
            head = next;
        }

        currOdd.next = Evenhead.next;
        return Oddhead.next;
    }
}
