public class Solution {

    public int lengthOfLastWord(String s) {
        if (null == s || "".equals(s))return 0;
        String[] strs = s.trim().split(" ");
        return strs[strs.length-1].length();
    }
}
