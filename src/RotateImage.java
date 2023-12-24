class RotateImage {
    public void rotate(int[][] matrix) {
        // the x, y element for 90 degree rotate
        // the whole rectrangle could be seen as the circle rotation 
        // the outer will rotate before the inner rotate as the even dimension 
        int n = matrix.length;

        for(int i=0; i<n/2;i++){
            for(int j=0;j<(n+1)/2;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = tmp;
            }
        }

    }

}
