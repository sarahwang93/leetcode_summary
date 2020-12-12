import java.util.Stack;

public class dailyTem {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] temp = new int[T.length];

        for(int i=0;i<T.length;i++){
            //use stack to store index
            //find the first element larger than curr number
            //then get the diff of index between array and stack
            while(!stack.isEmpty() && T[i] > T[stack.peek()]){
                temp[stack.peek()] = i- stack.pop();
            }

            stack.push(i);
            //System.out.println(stack);
        }

        return temp;
    }
}
