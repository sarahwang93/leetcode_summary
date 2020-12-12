public class randomNode {
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    int len;
    ListNode start;

    public randomNode(ListNode head) {
        ListNode node = head;
        while(node!=null){
            node = node.next;
            len++;
        }

        this.start = head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int random = (int)(Math.random()*len);

        ListNode node = this.start;

        for(int i=0;i<random;i++) node = node.next;
        return node.val;
    }
}
