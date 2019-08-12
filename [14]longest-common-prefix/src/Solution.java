public class Solution {

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        if (0 == strs.length)return result;
        if (1 == strs.length)return strs[0];
        boolean s = true;
        int key = 0;
        while (s){
            for (int i = 1; i < strs.length; i++) {
                if (key >= strs[0].length() || key >= strs[i].length())s = false;
                if (!s)break;
                if (strs[0].charAt(key) != strs[i].charAt(key))s = false;

            }
            if (s) key++;
        }
        result = strs[0].substring(0,key);
        return result;
    }

}
