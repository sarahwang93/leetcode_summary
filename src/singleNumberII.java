import java.util.HashMap;
import java.util.Map;

public class singleNumberII {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        int res = 0;
        for (Map.Entry me : map.entrySet()) {
            if(((Integer)me.getValue()).intValue()==1){
                res = ((Integer)me.getKey()).intValue();
            }
        }

        return res;
    }
}
