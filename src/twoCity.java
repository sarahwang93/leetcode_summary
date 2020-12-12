public class twoCity {
    public int twoCitySchedCost(int[][] costs) {
        int sum = 0;
        int[] res = new int[costs.length];
        for(int i=0; i<costs.length;i++){
            res[i] = costs[i][1] - costs[i][0];
            //4a + (2b - 2a) = 2b + 2a
            //2b + 2a should be the maximum
            sum += costs[i][0];
        }

        res = reverse(res);

        for(int j=0;j<costs.length/2;j++){
            sum += res[j];
        }

        return sum;
    }

    public int[] reverse(int[] arr){
        boolean flag = true;
        for(int i=0; i < arr.length -1; i++ ){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag=false;
                }
            }
            if(flag){
                break;
            }
        }
        return arr;
    }

}
