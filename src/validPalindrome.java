public class validPalindrome {
    public boolean isPalindrome(String s) {
        if(s.equals(" ") || s.length() == 0 || s.length() == 1){
            return true;
        }

        String news = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        boolean res = true;

        if(news.equals(" ") || news.length() == 0 || news.length() == 1){
            return true;
        }

        int len = news.length()-1;
        for(int i=0;i<=len/2;i++){
            boolean flag = true;
            if(len-i>len/2 && news.charAt(i) == news.charAt(len-i))
            {
                flag = true;
            }else{
                if(i != len-i){
                    flag = false;
                }
            }
            res = flag && res;
        }

        return res;
    }
}
