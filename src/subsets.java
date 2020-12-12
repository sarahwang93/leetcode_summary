import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        Arrays.sort(nums);
        List<Integer> emptySet=new ArrayList<Integer>();
        res.add(emptySet);

        for(int i=0;i<nums.length;i++){
            int l = res.size();
            System.out.println(l);
            //deal with not update the reference of list
            //so with list, before adding need to new a list
            for(int j=0;j<l;j++){
                List<Integer> last = new ArrayList<>(res.get(j));
                last.add(nums[i]);
                res.add(last);
            }
        }
        return res;
    }
}
