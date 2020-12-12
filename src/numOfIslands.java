import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class numOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int m=0;m<grid.length;m++){
            for(int n=0;n<grid[0].length;n++){
                //only do adjustment on value equals 1
                if(grid[m][n] == '1'){
                    bfs(grid, m, n);
                    count ++;
                }
            }
        }

        for(int i=0;i<grid.length;i++){
            System.out.println(Arrays.toString(grid[i]));
        }

        return count;
    }

    public void bfs(char[][] grid, int x, int y){
        grid[x][y] = '0';
        Queue<Integer> queue = new LinkedList<>();
        int i = grid.length;
        int j = grid[0].length;
        //update the matrix with
        /*
        [0, 1, 2, 3, 4, 5,
         6, 7, 8, 9, 10, 11,
         12,13,14,15,16,17]
        */
        int code = x*j + y;
        queue.offer(code);

        while(!queue.isEmpty()){
            int num = queue.poll();
            int hor = num/j;
            int ver = num%j;

            //push the next step from 4 directions
            //search adjacent island 1 as 0
            //since the adjacent will not imapct the result on surrounded island
            if(hor>0 && grid[hor-1][ver] == '1'){
                queue.offer((hor-1)*j + ver);
                grid[hor-1][ver] = '0';
            }

            if(hor<i-1 && grid[hor+1][ver] == '1'){
                queue.offer((hor+1)*j + ver);
                grid[hor+1][ver] = '0';
            }

            if(ver>0 && grid[hor][ver-1] == '1'){
                queue.offer(hor*j + (ver-1));
                grid[hor][ver-1] = '0';
            }

            if(ver<j-1 && grid[hor][ver+1] == '1'){
                queue.offer(hor*j + (ver+1));
                grid[hor][ver+1] = '0';
            }

        }

    }
}
