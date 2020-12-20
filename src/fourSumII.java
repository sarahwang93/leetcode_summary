import java.util.HashMap;
import java.util.Map;

public class fourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D){
        int N = A.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int sum = A[i] + B[i];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int paircount = 0;
        for(int k=0;k<N;k++){
            for(int l=0;l<N;l++){
                paircount += map.getOrDefault(-1 * (C[k] + D[l]), 0);

            }
        }
        return paircount;
    }

}
