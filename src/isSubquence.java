import java.util.List;

public class isSubquence {
    public boolean isSubsequence(String s, String t) {
        //corner case
        if(s.length() == 0){
            return true;
        }

        char[] sch = s.toCharArray();
        char start = sch[0];
        int count = 0;

        for(int j=0;j<t.toCharArray().length;j++){
            if(t.charAt(j) == start){
                count ++;
                if(count == s.length()){
                    return true;
                }
                start = sch[count];
            }
        }

        return false;
    }

    public boolean arrAsc(List<Integer> testlist){
        boolean flag = true;
        for(int lenb = 1;lenb<testlist.size();lenb++){
            if(testlist.get(lenb) - testlist.get(lenb-1) > 0){
                flag = true && flag;
            }else{
                flag = false && flag;
            }
        }

        return flag;
    }
}
