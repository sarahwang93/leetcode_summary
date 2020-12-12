import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class openLock {
    //shortest path problem
    public int openLock(String[] deadends, String target) {
        //from 0000 to target
        //find the shortest path from start to target
        HashSet<String> deadlist = new HashSet<>(Arrays.asList(deadends));
        String start = "0000";
        if(deadlist.contains(start)){
            return -1;
        }
        Queue<String> queue = new LinkedList<>();
        int step = 0;
        queue.offer(start);

        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-->0){
                String cur = queue.remove();
                if(cur.equals(target)){
                    return step;
                }
                char[] s = cur.toCharArray();
                for(int k=0;k<4;k++){
                    //add adjancy to queue
                    int i = s[k] - '0';
                    //-1 with left turn
                    s[k] = (char) ('0' + (i + 9) % 10);
                    String c = new String(s);
                    //System.out.println("s1= " + chs);
                    if(!deadlist.contains(c)){
                        queue.offer(c);
                        deadlist.add(c);
                    }
                    //+1 with right turn
                    s[k] = (char) ('0' + (i + 11) % 10);
                    c = new String(s);
                    //System.out.println("s2= "+ chs);
                    if(!deadlist.contains(c)){
                        queue.offer(c);
                        deadlist.add(c);
                    }

                    s[k] = (char) ('0' + i);
                    System.out.println(s);
                }
            }
            step ++;
        }
        //if all node in deadlist, queue will only has 0000 then after pop out, step will not return
        return -1;
    }
}
