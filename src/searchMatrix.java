public class searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int x = matrix.length - 1;
        int y = 0;

        while(x >= 0 && y < matrix[0].length){
            if(matrix[x][y] > target){
                x--;
            }else if(matrix[x][y] < target){
                y++;
            }else{
                return true;
            }
        }

        return false;
    }
}
