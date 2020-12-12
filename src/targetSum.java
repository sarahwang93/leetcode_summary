import java.util.Arrays;

public class targetSum {
    public int findTargetSumWays(int[] nums, int S) {
        //DFS
        //DP problem
        int count = 0;
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        if(S>sum || S<-sum) {
            return 0;
        }

        int[] dp = new int[sum * 2 + 1];
        dp[sum] = 1;

        for(int i=0;i<nums.length;i++){
            int[] tmp = new int[sum*2 + 1];
            for(int j=0;j<dp.length;j++){
                if(dp[j]!=0){
                    tmp[j + nums[i]] += dp[j];
                    tmp[j - nums[i]] += dp[j];
                }
            }
            System.out.println(Arrays.toString(tmp));
            dp = tmp;
        }
        //System.out.println(Arrays.toString(dp));

        return dp[sum+S];
    }
}
