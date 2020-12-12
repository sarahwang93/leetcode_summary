import java.util.Stack;

public class reversePolish {
    public int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length == 0){
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        String symbol = "+-*/";

        for(int i =0;i<tokens.length;i++){
            if(!symbol.contains(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
                continue;
            }

            int a = stack.pop();
            int b = stack.pop();

            switch(tokens[i].charAt(0)) {
                case '+':
                    stack.push(b + a);
                    break;
                case '-':
                    stack.push(b - a);
                    break;
                case '*':
                    stack.push(b * a);
                    break;
                case '/':
                    stack.push(b / a);
                    break;
            }

        }

        return stack.pop();
    }
}
