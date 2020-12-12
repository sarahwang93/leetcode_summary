import java.util.*;

public class groupAna {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> testlist = new ArrayList<>();

        HashMap<String, ArrayList<String>> testmap = new HashMap<String, ArrayList<String>>();
        for(int i=0;i<strs.length;i++){
            //use the sorted char as key
            //match same result and add to list
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);
            //no duplicate key allowed
            if(testmap.containsKey(str)){
                testmap.get(str).add(strs[i]);
            }
            else{
                ArrayList<String> list = new ArrayList<String>();
                list.add(strs[i]);
                testmap.put(str,list);
            }
        }

        for (Map.Entry<String, ArrayList<String>> entry : testmap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Iterator iter = testmap.values().iterator();
        while(iter.hasNext()){
            ArrayList<String> item = (ArrayList<String>)iter.next();
            Collections.sort(item);
            testlist.add(item);
        }


        return testlist;
    }
}
