public class prisonCells {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int count = 0;
        N = N % 14;
        //cycle = 14
        if(N == 0){
            N = 14;
        }

        while(count < N){
            int[] newcell = new int[8];
            for(int i=1;i<8;i++){
                if(i-1>-1 && i+1<8){
                    if(cells[i-1] == cells[i+1]){
                        newcell[i] = 1;
                    }else{
                        newcell[i] = 0;
                    }
                }
            }
            cells = newcell;
            count++;
        }
        return cells;
    }
}
