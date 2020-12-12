public class uncrossedLine {
    public int helperFun(int[] A, int[] B){
        int[][] dp = new int[A.length+1][B.length+1];
        for(int i=1;i<=A.length;i++)
            for(int j=1;j<=B.length;j++)
            {
                //case 1: values are same
                //if with same index, A and B are some, then increment 1
                if(A[i-1] == B[j-1])
                {
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    //case 2: values are different
                    //
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        //return the last value of dp
        return dp[A.length][B.length];
    }

    public int maxUncrossedLines(int[] A, int[] B) {
        int result = 0;
        result = helperFun(A,B);
        return result;
    }

}
