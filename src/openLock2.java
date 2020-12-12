import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class openLock2 {
    //shortest path problem
    public int openLock(String[] deadends, String target) {
        HashSet<String> dead = new HashSet<>(Arrays.asList(deadends));
        String start = "0000";

        if(dead.contains(start)){
            return -1;
        }
        Queue<String> q = new LinkedList<>();
        q.offer(start);
        int step = 0;

        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                //when remove one node need to add all neighbour of that node
                String curr = q.remove();
                if(curr.equals(target)){
                    return step;
                }
                //add the neighbour to queue
                String next[] = new String[8];
                next = getnext(curr);
                for(int i=0;i<next.length;i++){
                    if(!dead.contains(next[i])){
                        q.offer(next[i]);
                        ///this line is to determine when to stop the while loop
                        dead.add(next[i]);
                    }
                }
            }
            step++;
        }
        return -1;
    }

    public String[] getnext(String lock){
        String[] res = new String[8];
        for(int i=0;i<4;i++){
            res[i*2] = lock.substring(0,i)+((lock.charAt(i)-'0'+1)%10)+lock.substring(i+1,4);
            res[i*2+1] = lock.substring(0,i)+((lock.charAt(i)-'0'+9)%10)+lock.substring(i+1,4);
        }

        return res;
    }

}
