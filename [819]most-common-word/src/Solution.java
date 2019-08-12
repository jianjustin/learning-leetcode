import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution {

    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < banned.length; i++)
            map.put(banned[i].toLowerCase(),-1);

        String max_str = "";
        int max = 0;

        StringTokenizer st = new StringTokenizer(paragraph,"!?',;. ");
        while (st.hasMoreElements()){
            String item = st.nextElement().toString().toLowerCase();
            if (null == map.get(item))map.put(item,0);
            if (-1 == map.get(item))continue;
            map.put(item,map.get(item)+1);
            if (map.get(item) > max){
                max_str = item;
                max = map.get(item);
            }
        }

        return max_str;
    }

    public boolean isletter(char c){
        if (c >= 65 && c <= 90)return true;
        if (c >= 97 && c <= 122)return true;
        return false;
    }


}
