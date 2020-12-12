/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
public class flattenLinkedlist {
    public Node flatten(Node head) {
        if(head == null){
            return null;
        }
        else{
            Node curr = head;
            while(curr!=null){
                if(curr.child == null){
                    curr = curr.next;
                    continue;
                }
                //iterate until curr.child is not null
                Node tmp = curr.child;
                while(tmp.next!=null){
                    //find the tail of child level
                    tmp = tmp.next;
                }
                //append the disturbed part with the tail
                tmp.next = curr.next;
                if(curr.next!=null){
                    //append tail
                    curr.next.prev = tmp;
                }
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
            }
        }
        return head;
    }
}
