public class maxCircular {
    public int maxSubarraySumCircular(int[] A) {
        int res = A[0];
        for(int i : A){
            res = Math.max(res, i);
        }
        if(res <= 0) return res;
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum = Math.max(0, sum + A[i]);
            res = Math.max(sum, res);
        }
        int minimum = 0;
        sum = 0;
        for(int i = 0; i < A.length; i++){
            sum = Math.min(0, sum + A[i]);
            minimum = Math.min(minimum, sum);
        }
        int temp = 0;
        for(int i : A) temp += i;
        res = Math.max(res, temp - minimum);
        return res;

    }

}
