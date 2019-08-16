import java.util.*;

public class Solution {

    public int compress(char[] chars) {
        int count = 0;
        int[]  char_count = new int[92];
        Set<Character> set = new HashSet<Character>();

        for (int i = 0; i < chars.length; i++) {
            char_count[chars[i] - 35]++;
            set.add(chars[i]);
        }

        Iterator<Character> iterator = set.iterator();
        int key = 0;
        while (iterator.hasNext()){
            char item = iterator.next();
            chars[key++] = item;
            if (char_count[item-35] > 1){
                Integer s = new Integer(char_count[item-35]);
                char[] ss = s.toString().toCharArray();
                for (int i = 0; i < ss.length; i++)
                    chars[key++] = ss[i];

            }
        }
        return count;
    }

}
