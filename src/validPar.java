import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class validPar {
    public boolean isValid(String s) {
        if(s.length() == 1){
            return false;
        }

        Stack<String> stack = new Stack<>();
        String[] str = {"]", "}", ")"};
        List<String> list = new ArrayList<>(Arrays.asList(str));
        char[] ch = s.toCharArray();

        for(int i=0;i<ch.length;i++){
            String sch = Character.toString(ch[i]);
            if(!list.contains(sch)){
                stack.push(sch);
            }else if(sch.equals(")")){
                if(stack.isEmpty() || !stack.pop().equals("(")){
                    return false;
                }
            }else if(sch.equals("]")){
                if(stack.isEmpty() || !stack.pop().equals("[")){
                    return false;
                }
            }else if(sch.equals("}")){
                if(stack.isEmpty() || !stack.pop().equals("{")){                                                           return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
