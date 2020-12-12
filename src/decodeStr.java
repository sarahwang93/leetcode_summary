import java.util.Stack;

public class decodeStr {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<String> result = new Stack<>();
        String res = "";
        int pointer = 0;

        while (pointer < s.length()) {
            if (Character.isDigit(s.charAt(pointer))) {
                int count = 0;
                while (Character.isDigit(s.charAt(pointer))) {
                    //number will increase as 10 times of character
                    //like 30, first loop count is 3, next loop will be 30+0
                    count = 10 * count + (s.charAt(pointer) - '0');
                    pointer++;
                }
                counts.push(count);
            } else if (s.charAt(pointer) == '[') {
                result.push(res);
                //after res is pushed, recover res to "", because res need to become the sub-str between brackets
                res = "";
                pointer++;
            } else if (s.charAt(pointer) == ']') {
                StringBuilder tmp = new StringBuilder(result.pop());
                int count = counts.pop();
                for (int i = 0; i < count; i++) {
                    tmp.append(res);
                }
                res = tmp.toString();
                pointer++;
            } else {
                res += s.charAt(pointer);
                pointer++;
            }
        }

        return res;
    }

    public static void main(String[] args){
        String input = "3[a]2[bc]";
        decodeStr dec = new decodeStr();
        dec.decodeString(input);
    }

}
