public class distributeCandies {
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int[] left = new int[num_people];
        for(int i=0;i<num_people;i++){
            int num = i+1;
            if(candies > num){
                res[i] = num;
                candies = candies - num;
            }else{
                res[i] = candies;
                candies = 0;
            }
        }

        int count = 0;
        System.out.println(candies);
        if(candies == 0){
            left = res;
        }else if(candies > 0){
            //candies == 4
            while(candies>0){
                count ++;
                for(int i=0;i<num_people;i++){
                    int newnum = count*num_people + i + 1;
                    if(candies <= newnum){
                        res[i] += candies;
                        candies = 0;
                    }else{
                        res[i] += newnum;
                        candies = candies - newnum;
                    }
                }

            }
            return res;
        }

        return left;
    }
}
