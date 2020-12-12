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
public class middleLinkedlist {
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        ListNode nodee = head;

        ListNode ans = null;
        int length = 0;

        while(head != null){
            head = head.next;
            length ++;
        }

        int mid = 0;
        if(length%2 == 1){
            mid = length/2 + 1;
            mid = mid - 1;
            while(mid>0 && node!=null){
                node = node.next;
                System.out.println(node.val);
                mid --;
            }
        }else{
            mid = length/2;
            while(mid>0 && nodee!=null){
                nodee = nodee.next;
                mid--;
            }
        }

        if(length%2 == 1){
            ans = node;
        }else{
            ans = nodee;
        }

        return ans;

    }
}
