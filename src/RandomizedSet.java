import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomizedSet {
    List<Integer> list = new ArrayList<>();
    Random ran = new Random();

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        for(int i:list){
            if(i == val){
                return false;
            }
        }
        list.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        for(int j:list){
            if(j == val){
                list.remove(new Integer(j));
                return true;
            }
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(ran.nextInt(list.size()));
    }
}
