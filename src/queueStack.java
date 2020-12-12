import java.util.Stack;

public class queueStack {
    private Stack stack1;
    private Stack stack2;
    private int front;
    /** Initialize your data structure here. */
    public queueStack() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    //the lastest element should be the bottom of stack with FIFO
    public void push(int x) {
        if(stack1.isEmpty()){
            front = x;
        }

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        stack2.push(x);

        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!stack1.isEmpty()){
            front = (int)stack1.peek();
        }
        return (int)stack1.pop();
    }

    /** Get the front element. */
    public int peek() {
        return (int)stack1.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(stack1.size() == 0){
            return true;
        }

        return false;
    }
}
