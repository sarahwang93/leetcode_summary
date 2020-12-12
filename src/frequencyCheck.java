import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class frequencyCheck {
    public String frequencySort(String s) {
        String result = "";

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        char[] strchar = s.toCharArray();
        for(int i=0;i<strchar.length;i++){
            String test = Character.toString(strchar[i]);
            if(!map.containsKey(test)){
                map.put(test,1);
            }else{
                map.put(test,map.get(test)+1);
            }
        }

        Map<String, Integer> sortedmap
                = map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedmap);

        for(Map.Entry entry:sortedmap.entrySet()){
            String ss = entry.getKey().toString();
            Integer times = (Integer)entry.getValue();
            result += ss.repeat(times);
        }

        System.out.println(result);


        return result;
    }

}
