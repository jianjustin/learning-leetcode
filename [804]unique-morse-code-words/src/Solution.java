import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int uniqueMorseRepresentations(String[] words) {
        int result = 0;
        Map<String,Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            String item = "";
            for (int j = 0; j < words[i].length(); j++) {
                item += getCharMap(words[i].substring(j,j+1).toCharArray()[0]);
            }
            if (null == map.get(item) || 1 != map.get(item)){
                result++;
                map.put(item,1);
            }
        }
        return result;
    }

    public String getCharMap(char c){
        String[] strs = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        return strs[c-97];

    }



}
