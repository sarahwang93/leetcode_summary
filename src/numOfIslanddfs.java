public class numOfIslanddfs {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if(m==0) {
            return 0;
        }
        int n = grid[0].length;
        int count = 0;
        for(int q=0;q<m;q++){
            for(int p=0;p<n;p++){
                if(grid[q][p] == '1'){
                    count ++;
                    dfs(grid, p, q, m, n);
                }
            }
        }

        return count;

    }

    public void dfs(char[][] grid, int p, int q, int n, int m){
        if(p<0 || q<0 || p>=m || q>=n || grid[q][p] == '0')
            return;
        grid[q][p] = '0';

        dfs(grid, p-1, q, n, m);
        dfs(grid, p+1, q, n, m);
        dfs(grid, p, q-1, n, m);
        dfs(grid, p, q+1, n, m);

    }
}
