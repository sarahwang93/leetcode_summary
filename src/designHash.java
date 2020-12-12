import java.util.ArrayList;
import java.util.List;

public class designHash {
    private List<Integer> hashset;
    /** Initialize your data structure here. */
    public designHash() {
        hashset = new ArrayList<>();
    }

    public void add(int key) {
        hashset.add(key);
    }

    public void remove(int key) {
        //System.out.println(hashset);
        while(hashset.size()>0 && hashset.contains(key)){
            hashset.remove(hashset.indexOf(key));
        }
        //System.out.println(hashset);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        for(int i=0;i<hashset.size();i++){
            if(hashset.get(i) == key){
                return true;
            }
        }
        return false;
    }
}
