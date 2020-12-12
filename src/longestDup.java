import java.util.HashSet;

public class longestDup {
    int a;
    long modulus;
    public String longestDupSubstring(String S) {
        a = 26;
        modulus = (long)Math.pow(2,32);
        int left = 1;
        int right = S.length()-1;
        String result = "";
        while(left<=right){
            int mid = left+(right-left)/2;
            String tmp = searchRab(S, mid);
            //search start from mid
            //if the value larger than mid,
            //then value should be on the right half side, left equal to mid + 1
            //if the value smaller than new mid,
            //value should be on the left half side, then right equal to mid - 1
            //when find the mid is the value, then return index of mid
            if(tmp != null)
            {
                result = tmp;
                left = mid + 1; //second half
            }else{
                right = mid -1; //first half
            }
        }
        return result;
    }

    public String searchRab(String S, int patternLen){
        HashSet<Long> set = new HashSet<>();
        long hash = 0L;
        long aL = 1L;
        for(int i=1;i<=patternLen;++i){
            aL = (aL * a)%modulus;
        }
        for(int i=0;i<patternLen;++i){
            //this hash is just to provide a hash value to the corresponding charater
            //to make sure the character has unique hash value
            hash = (hash * a + (S.charAt(i) - 'a'))%modulus;
        }
        //initial set with the first hash value
        set.add(hash);
        System.out.println(set);
        for(int start=1;start+patternLen-1<S.length();start++){
            int end = start+patternLen-1;
            hash = (hash * a - (S.charAt(start-1)-'a') * aL % modulus + modulus) % modulus;
            hash = (hash + (S.charAt(end)-'a')) % modulus;
            if(set.contains(hash)) return S.substring(start,end+1);
            set.add(hash);
        }
        return null;
    }
}
