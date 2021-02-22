import java.util.HashSet;
import java.util.Set;

public class nQueens {
    Set<Integer> col = new HashSet<>();
    Set<Integer> diag1 = new HashSet<>();
    Set<Integer> diag2 = new HashSet<>();

    public int totalNQueens(int n){
        int[] res = new int[1];
        helper(res, n, 0);
        return res[0];
    }
    //start from row 0
    //check the up and down direction until go through all units
    public void helper(int[] res, int n, int row){
        if(row == n){
            res[0] ++;
        }
        else{
            for(int i=0;i<n;i++){
                if(col.contains(i) || diag1.contains(i+row) || diag2.contains(row-i)) continue;
                else{
                    col.add(i);
                    diag1.add(i+row);
                    diag2.add(row-i);
                    helper(res, n, row+1);
                    diag1.remove(i);
                    diag2.remove(row-i);
                }
            }

        }
    }

}
