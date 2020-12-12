import java.util.Arrays;

public class sortColor {
    public int[] sortColors(int[] nums) {
        int tmp = 0;
        int pointer = 0;
        int pointer2 = nums.length-1;
        int i = 0;

        if(nums.length == 2 && nums[1]-nums[0]>=0){
            return nums;
        }

        while(i<=pointer2){
            //when 0 is the element needed to be sort
            //nums[i] == 0, so the switch should be larger than 0
            if(nums[i] == 0){
                tmp = nums[pointer];
                nums[pointer] = nums[i];
                nums[i] = tmp;
                pointer++;
            }
            //when 2 is the element
            //nums[i] == 2, so the switch should be less than 2
            else if(nums[i] == 2){
                tmp = nums[pointer2];
                nums[pointer2] = nums[i];
                nums[i] = tmp;
                pointer2--;
                i--;
            }
            //when result satisfy the condition required
            //break the for loop
            i++;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
