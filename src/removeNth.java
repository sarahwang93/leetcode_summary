public class removeNth {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int i = 0;
        while(node!=null){
            i++;
            node = node.next;
        }

        //if remove the first element
        int s = i-n+1;
        if(s == 1){
            return head.next;
        }

        //if remove non-first element
        node = head;
        int j = 0;
        while(node!=null){
            j++;
            if(j == s-1){
                node.next = node.next.next;
            }
            node = node.next;
        }

        return head;
    }

}
