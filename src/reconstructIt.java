import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class reconstructIt {
    public List<String> findItinerary(List<List<String>> tickets) {
        LinkedList<String> result = new LinkedList<>();
        HashMap<String, PriorityQueue<String>> targets = new HashMap<>();

        for(int i=0;i<tickets.size();i++){
            targets.putIfAbsent(tickets.get(i).get(0), new PriorityQueue<String>());
            targets.get(tickets.get(i).get(0)).add(tickets.get(i).get(1));
        }

        dfs(result, targets,"JFK");
        return result;
    }

    public void dfs(LinkedList<String> result, HashMap<String, PriorityQueue<String>> targets, String start){
        while(targets.containsKey(start) && !targets.get(start).isEmpty()){
            dfs(result, targets, targets.get(start).poll());
        }

        result.addFirst(start);
    }
}
