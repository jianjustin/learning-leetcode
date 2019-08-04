public class Solution {

    public String toLowerCase(String str) {
        String result = "";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i]<=90)
                chars[i] += 32;
        }

        result = new String(chars);
        return result;
    }

}
