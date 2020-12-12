import java.util.ArrayList;
import java.util.List;

public class findDuplicate {
    public int findDuplicate(int[] nums) {
        List<Integer> unique = new ArrayList<>();

        int result = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    result = nums[i];
                }
            }
        }
        return result;
    }
}
