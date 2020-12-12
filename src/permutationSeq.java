import java.util.ArrayList;
import java.util.List;

public class permutationSeq {
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();

        int[] possibility = new int[n];
        possibility[0] = 1;
        for (int i = 1; i < n; i++) {
            possibility[i] = possibility[i - 1] * i;
        }

        for (int j = 0; j < n; j++) {
            list.add(j + 1);
        }

        k = k - 1;
        String str = "";
        for (int i = n - 1; i >= 0; i--) {
            //for each first element get from list
            int first = k / possibility[i];
            str += list.remove(first);
            k = k % possibility[i];
        }
        return str;
    }
}
