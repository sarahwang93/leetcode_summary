import java.util.Random;

public class randomPick {
    private Random rand = new Random();
    private int[] list;

    public randomPick(int[] w) {
        for(int i=1;i<w.length;i++){
            w[i] += w[i-1];
        }
        list = w;
        //System.out.println(Arrays.toString(list));
    }

    public int pickIndex() {
        //random result is from 0-3/ then convert to 1-4
        int randomVal = rand.nextInt(list[list.length-1])+1;
        int index = binarySearch(randomVal);
        return index;
    }

    public int binarySearch(int target){
        int left = 0;
        int right = list.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(target > list[mid])
            {
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }

}
