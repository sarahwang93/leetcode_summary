public class detectCapital {
    public boolean detectCapitalUse(String word) {
        boolean res1 = isCapital(word);
        boolean res2 = isLower(word);
        boolean res3 = isFirstCap(word);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        return res1 || res2 || res3;
    }

    public boolean isCapital(String word){
        char[] wordch = word.toCharArray();
        boolean result = true;
        for(int i=0;i<wordch.length;i++){
            boolean flag = Character.isUpperCase(wordch[i]);
            result = flag && result;
        }
        return result;
    }

    public boolean isLower(String word){
        char[] wordch = word.toCharArray();
        boolean result = true;
        for(int i=0;i<wordch.length;i++){
            boolean flag = Character.isLowerCase(wordch[i]);
            result = flag && result;
        }
        return result;
    }

    public boolean isFirstCap(String word){
        char[] wordch = word.toCharArray();
        boolean result = true;
        if(Character.isUpperCase(wordch[0])){
            for(int i=1;i<wordch.length;i++){
                boolean flag = Character.isLowerCase(wordch[i]);
                result = flag && result;
            }
        }else{
            result = false;
        }
        return result;
    }
}
