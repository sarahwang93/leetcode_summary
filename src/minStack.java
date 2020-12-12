import java.util.ArrayList;
import java.util.List;

public class minStack {
    private List<Integer> list;
    private int size = 0;
    /** initialize your data structure here. */
    public minStack() {
        list  = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
        size++;
    }

    public void pop() {
        if(list.size()>0){
            list.remove(list.size()-1);
            size--;
        }

    }

    public int top() {
        return list.get(list.size()-1);
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.size();++i){
            min = Math.min(min, list.get(i));
        }

        return min;
    }
}
