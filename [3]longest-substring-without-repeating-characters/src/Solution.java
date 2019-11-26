import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (null == s || s.length() == 0)return 0;
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j)))i = Math.max(map.get(s.charAt(j)), i);//起始位置滑动
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);//保存字符后一位
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}
