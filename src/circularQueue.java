public class circularQueue {
    private int[] queue;
    private int start;
    private int end;
    private int size;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    //constructor to init class
    public circularQueue(int k) {
        queue = new int[k];
        start = 0;
        end = 0;
        size = k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        queue[ end++ % size] = value;
        //System.out.println(Arrays.toString(queue));
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        start  ++;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[start % size];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[(end - 1) % size];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return start == end;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        //circular queue size cannot exceed
        return end - start == size;
    }
}
