public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                return i;
            }else if(target<nums[i]){
                return i;
            }
        }

        for(int j=0;j<nums.length;j++){
            if(target>nums[j]){
                result = j+1;
            }
        }

        return result;
    }
}
