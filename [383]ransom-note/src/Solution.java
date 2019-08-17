import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ints = new int[26];
        for (char c:magazine.toCharArray())
            ints[c-'a']++;
        for (char c:ransomNote.toCharArray()) {
            ints[c-'a']--;
            if(ints[c-'a']<0)return false;
        }
        return true;
    }

}
