import java.util.Collections;
import java.util.Stack;

public class removeDigits {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();

        int remain = num.length()-k;
        if(remain==0){
            sb.append(0);
            return "0";
        }

        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            while(k>0 && stack.size()>0 && stack.peek()>ch){
                stack.pop();
                k--;
            }
            stack.push(ch);
        }

        for(int i=0;i<k && stack.size()!=0;i++){
            stack.pop();
        }

        Collections.reverse(stack);

        while(stack.size() > 1 && stack.peek() == '0') stack.pop();
        while(stack.size()!= 0) sb.append(stack.pop());

        return sb.toString();
    }

}
