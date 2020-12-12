import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class reconstructedQueue {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> list = new LinkedList<int[]>();
        Arrays.sort(people, (a, b) -> (a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]));
        for(int[] single:people){
            list.add(single[1], single);
        }
        return list.toArray(new int[people.length][2]);
    }
}
