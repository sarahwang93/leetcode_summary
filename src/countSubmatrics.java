public class countSubmatrics {
    public int countSquares(int[][] matrix) {
        int num = 0;
        int width = matrix[0].length;
        if(width == 0){
            return 0;
        }
        int height = matrix.length;
        if(height == 0){
            return 0;
        }
        int standard = width > height?width:height - 1;
        int tmp = 1;

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(matrix[i][j]==1 && i>0 && j>0){
                    matrix[i][j] = 1 + Math.min(matrix[i-1][j-1], Math.min(matrix[i-1][j], matrix[i][j-1]));
                }

                num += matrix[i][j];
            }
        }
        return num;
    }

}
