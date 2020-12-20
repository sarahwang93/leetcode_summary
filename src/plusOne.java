import java.util.List;
import java.util.Stack;

public class plusOne {
    public ListNode plusOne(ListNode head){
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        while(node!=null){
            stack.push(node);
            node = node.next;
        }

        while(stack.isEmpty()){
            ListNode first = stack.pop();
            if(first.val != 9){
                first.val ++;
            }
            first.val = 0;
        }

        //edge case sentinel head
        ListNode sentinelNode = new ListNode(1);
        sentinelNode.next = head;

        return sentinelNode;

    }
    


}
