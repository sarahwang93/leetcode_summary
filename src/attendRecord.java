public class attendRecord {
    public boolean checkRecord(String s) {
        int abs = 0;
        int late = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'A'){
                abs ++;
            }

        }

        int count = 1;
        int maxCount = 1;
        for(int j=1;j<s.length();j++){
            if(s.charAt(j-1) == s.charAt(j) && s.charAt(j) == 'L'){
                count ++;
                if(count > maxCount) maxCount = count;
            }
            else{
                count = 1;
            }
        }


        if(abs >1 || maxCount>2){
            return false;
        }else{
            return true;
        }
    }
}
