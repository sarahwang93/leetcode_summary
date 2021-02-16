public class searchMatrixBinary {

    public boolean binarySearch(int[][] matrix, int target, int start, boolean vertical){
        int lo =  start;
        int hi = vertical ? matrix[0].length-1 : matrix.length-1;

        while(hi >= lo){
            int mid = (lo + hi)/2;

            if(vertical){ //go through column
                if(matrix[start][mid] < target){
                    lo = mid + 1;
                }else if(matrix[start][mid] > target){
                    hi = mid - 1;
                }else{
                    return true;
                }
            }
            else{ //go through row with same method in binary search
                if(matrix[mid][start] < target){
                    lo = mid + 1;
                }else if(matrix[mid][start] > target){
                    hi = mid - 1;
                }else{
                    return true;
                }
            }
        }

        return false;
    }


    public boolean searchMatrix(int[][] matrix, int target){
        if(matrix == null || matrix.length == 0){
            return false;
        }

        int shortDim = Math.min(matrix.length, matrix[0].length);
        for(int i=0;i<shortDim;i++){
            boolean verticalFound = binarySearch(matrix, target, i,true);
            boolean horizionalFound = binarySearch(matrix, target, i,false);

            if(verticalFound || horizionalFound){
                return true;
            }
        }


        return false;
    }

}
