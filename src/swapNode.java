class swapNode {

    ListNode firstK = null;
    ListNode lastK = null;

    public ListNode swapNodes(ListNode head, int k) {
        int sizeList = 0;
        ListNode Node = head;

        while(Node!=null){
            sizeList ++;
            Node = Node.next;
        }

        //first kth index is k
        //last kth index is sizelist-k+1
        firstK = head;
        for(int i=1;i<k;i++){
            firstK = firstK.next;
        }

        lastK = head;
        for(int i=1;i<=sizeList - k;i++){
            lastK = lastK.next;
        }

        //swap 2 nodes 
        int temp = firstK.val;
        firstK.val = lastK.val;
        lastK.val = temp;

        return head;
    }
}