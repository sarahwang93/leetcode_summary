import java.util.LinkedList;
import java.util.Queue;

public class stackQueue {
    private Queue<Integer> q1; //in
    private Queue<Integer> q2; //out
    private int top;
    /** Initialize your data structure here. */
    public stackQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        //at the beginning q1 is empty, q2 has 1 element
        //then switch 2 queues, q2 is empty, q1 has one element(1)
        //secondly, add element onto q2(2), retrieve q1 with each element adding to q2
        //q1 -> empty, q2 -> 2,1, then switch 2 queues
        //add element onto q2(3), retrieve q1 with each element with 3, 2, 1 in q2, q1 is empty
        //switch 2 queues q1 is the result
        q2.add(x);
        top = x;
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }

        Queue<Integer> tmp = q1;
        q1 = q2;
        q2 = tmp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        top = q1.remove();

        return top;
    }


    /** Get the top element. */
    public int top() {
        if(!q1.isEmpty()){
            top = q1.peek();
        }
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
