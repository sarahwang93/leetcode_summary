import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class closestPoints {
    public int[][] kClosest(int[][] points, int K) {
        double distance = 0;
        Map<Double, int[]> rankmap = new HashMap<Double, int[]>();
        int[][] result = new int[K][2];
        Map<int[], Double> rankmap1 = new HashMap<int[], Double>();
        //corner case
        if(K == points.length){
            return points;
        }

        int[] tmp;
        int[] tmp1;
        for(int[] single: points){
            distance  = Math.sqrt(single[0]*single[0] + single[1]*single[1]);
            if(rankmap.containsKey(distance)){
                tmp1 = rankmap.get(distance);
                System.out.println(Arrays.toString(tmp1));
                tmp = single;
                System.out.println(Arrays.toString(tmp));
                if(!Arrays.equals(tmp, tmp1)){
                    rankmap1.put(tmp,distance);
                    rankmap1.put(tmp1, distance);

                    return rankmap1.keySet().toArray(result);
                }
            }
            rankmap.put(distance, single);
        }

        //sort hashmap by keys
        TreeMap<Double, int[]> sortedrank = new TreeMap(rankmap);
        Set<Map.Entry<Double, int[]>> mappings = sortedrank.entrySet();
        Map<Double, int[]> resultmap = mappings
                .stream()
                .limit(K)
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue));

        return resultmap.values().toArray(result);

    }

}
