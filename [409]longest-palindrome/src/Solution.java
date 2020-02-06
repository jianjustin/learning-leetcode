import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestPalindrome(String s) {
        Set<Character> hs = new HashSet<>();
        int count = 0;
        if(s.length() == 0)return 0;

        for(int i = 0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        return hs.isEmpty() ? count * 2 : count * 2 + 1;
    }
}
