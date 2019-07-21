import java.util.*;

public class Solution {

    public List<String> commonChars(String[] A) {
        List<String> result = new ArrayList<String>();
        Map<String,Integer>[] maps = (Map<String,Integer>[])new Map[A.length];
        for (int i = 0; i < A.length; i++) {
            Map<String,Integer> map = new HashMap<String,Integer>();
            for (int j = 0; j < A[i].length(); j++) {
                String key = A[i].substring(j,j+1);
                if(null == map.get(key))map.put(key,0);
                int times = map.get(key);
                times++;
                map.put(key,times);
            }
            maps[i] = map;
        }

        Set<String> keys = maps[0].keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
           String key = iterator.next();
           int min = maps[0].get(key);
           for (int i = 1; i < maps.length; i++) {
               if (null == maps[i].get(key))maps[i].put(key,0);
               int times = maps[i].get(key);
               if(min > times)maps[0].put(key,min = times);

           }

           if (null != maps[0].get(key) && maps[0].get(key) > 0){
               for (int i = 0; i < maps[0].get(key); i++) {
                   result.add(key);
               }

           }

        }

        return result;

    }
}
