public class reverseWord {
    public String reverseWords(String s) {
        String st = s.trim();
        String[] input = st.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i =input.length-1;i>=0;i--){
            if(input[i].length() == 0){

            }else{
                if(i == 0){
                    sb.append(input[i]);
                }else{
                    sb.append(input[i] + " ");
                }
            }
        }
        return sb.toString();
    }
}

