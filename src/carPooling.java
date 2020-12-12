import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class carPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, Comparator.comparing(trip -> trip[1]));
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(trip -> trip[2]));
        System.out.println(pq);

        for(int[] trip: trips){
            while(!pq.isEmpty() && trip[1] >= pq.peek()[2])
                //when the person get on in the middle of path
                //as person get off from first part, then remaining capacity add more
                capacity += pq.poll()[0];
            //start from reduce, as person get on, then capacity reduce
            capacity -= trip[0];
            if(capacity<0) return false;
            pq.offer(trip);
        }
        return true;
    }
}
