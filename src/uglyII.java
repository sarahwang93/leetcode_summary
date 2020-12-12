public class uglyII {
    public int nthUglyNumber(int n) {
        //start from 1
        int[] res = new int[n];
        res[0] = 1;

        int twoindex = 0;
        int threeindex = 0;
        int fiveindex = 0;
        int two = 2;
        int three = 3;
        int five = 5;

        for(int i=1;i<n;i++){
            //get the least number for each index
            int minNum = Math.min(five, Math.min(two, three));
            res[i] = minNum;

            if(minNum == two){
                two = 2 * res[++twoindex];
            }

            if(minNum == three){
                three = 3 * res[++threeindex];
            }

            if(minNum == five){
                five = 5 * res[++fiveindex];
            }

        }
        return res[n-1];

    }
}
