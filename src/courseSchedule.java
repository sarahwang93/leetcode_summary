import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class courseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> graphCourse = new HashMap<>();
        graph(numCourses, graphCourse, prerequisites);
        boolean res = true;

        if(numCourses==0 || prerequisites.length == 0){
            return true;
        }


        //DFS maintain the visited array
        int[] visited = new int[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!canFinish(graphCourse, visited, i)){
                return false;
            }
        }

        return res;
    }

    public void graph(int n, HashMap<Integer, List<Integer>> map, int[][] pre){
        for(int i=0;i<n;i++){
            map.put(i, new ArrayList<Integer>());
        }

        for(int i=0;i<pre.length;i++){
            map.get(pre[i][1]).add(pre[i][0]);
        }
    }

    public boolean canFinish(HashMap<Integer, List<Integer>> graphmap,int[] visited, int i){
        if(visited[i]==-1)
        {
            return false;
        }else if(visited[i]==1){
            return true;
        }

        visited[i] = -1;
        if(graphmap.containsKey(i)){
            for(int j:graphmap.get(i)){
                if(!canFinish(graphmap, visited, j)){
                    return false;
                }
            }
        }
        visited[i] = 1;
        return true;

    }
}
