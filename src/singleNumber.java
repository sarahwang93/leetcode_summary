import java.util.ArrayList;
import java.util.List;

public class singleNumber {
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int result = 0;
        for(int i=0; i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }else if(list.contains(nums[i])){
                boolean flag = list.remove(Integer.valueOf(nums[i]));
                if(flag){
                    continue;
                }else{
                    result = list.get(0);
                }
            }
        }

        return list.get(0);
    }

}
