public class searchMatrixDivide {
    private int target;
    private int[][] matrix;

    public boolean searchRec(int left, int right, int up, int down){
        /**
         *   1  4  7  11 15
         *   2  5  8  12 19
         *   3  6  9  16 22
         *   10 13 14 17 24
         *   18 21 23 26 30
         */
        if(left > right || up > down){
            return false;
        }else if(target < matrix[up][left] || target > matrix[down][right]){
            return false;
        }

        int mid = left + (right-left)/2;
        //similar as narrow down scoop to target
        int row = up;
        while(row <= down && matrix[row][mid] <= target){
            if(matrix[row][mid] == target){
                return true;
            }
            row++;
        }

        return searchRec(mid+1,right, up, row-1) || searchRec(left, row, mid-1, down);
    }

}
