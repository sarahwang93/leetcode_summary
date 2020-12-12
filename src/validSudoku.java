import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class validSudoku {
     private boolean check(int i, int i1, int j, int j1, char[][] board) {
            Set duplicates = new HashSet();
            for (int r = i; r < i1; r++) {
                for (int c = j; c < j1; c++) {
                    if (board[r][c] == '.')
                        continue;
                    if(duplicates.contains(board[r][c])) {
                        return false;
                    }
                    duplicates.add(board[r][c]);
                }
            }
            return true;
        }

        public boolean isValidSudoku(char[][] board) {
            //int[] range = [1,2,3,4,5,6,7,8,9]
            List<Character> testlist = new ArrayList<Character>();

            //check horizental without repetition
            for(int i=0;i<9;i++)
            {
                testlist.clear();
                for(int j=0;j<9;j++){
                    if(board[i][j] == '.'){
                        continue;
                    }
                    else if(!testlist.contains(board[i][j]))
                    {
                        testlist.add(board[i][j]);
                    }
                    else if(testlist.contains(board[i][j])){
                        return false;
                    }
                    else if(i==8 & j==8){
                        return true;
                    }
                }
            }

            //check portrait without repetition
            for(int m=0;m<9;)
            {
                testlist.clear();
                for(int n=0;n<9;n++)
                {
                    if(board[n][m] == '.'){
                        continue;
                    }
                    else if(!testlist.contains(board[n][m]))
                    {
                        testlist.add(board[n][m]);
                    }
                    else if(testlist.contains(board[n][m]))
                    {
                        return false;
                    }
                    else if(n==8 & m==8){
                        return true;
                    }
                }
                m++;
            }

            //check single unit for repetition
            for (int i = 0; i <= board.length - 3; i = i + 3) {
                for (int j = 0; j <= board[0].length - 3; j = j + 3) {
                    if (!check(i, i + 3, j, j + 3, board)) {
                        return false;
                    }
                }
            }


            return true;
        }
}
