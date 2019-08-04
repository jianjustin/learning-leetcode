public class Solution {

    public String reverseWords(String s) {
        String result = "";
        String[] strs = s.split(" ");

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            for (int j = 0; j < chars.length/2; j++) {
                char temp = chars[j];
                chars[j] = chars[chars.length-j-1];
                chars[chars.length-j-1] = temp;
            }
            strs[i] = new String(chars);
            result += strs[i] + " ";
        }

        return  result.substring(0,result.length()-1);

    }

}
